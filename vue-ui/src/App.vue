
<template>
  <header>
    <img alt="Vue logo" class="logo" src="@/assets/logo.svg" width="125" height="125" />

    <div class="wrapper">
      <h1>Welcome to vue calculator</h1>
      <div>
        <label for="number1">Number 1</label>
        <input id="number1" type="number" v-model="number1">

        <p>+</p>

        <label for="number2">Number 2</label>
        <input id="number2" type="number" v-model="number2">

        <p>=</p>

        <label for="result">Result</label>
        <input id="result" type="number" :value="result" readonly>
      </div>
    </div>
  </header>

  <RouterView />
</template>

<script setup>
  import { ref, computed } from 'vue';
  import { RouterLink, RouterView } from 'vue-router'


  const number1 = ref(0);
  const number2 = ref(0);

  const result = computed(() => Number(number1.value) + Number(number2.value));
</script>

<style scoped>
header {
  line-height: 1.5;
  max-height: 100vh;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

nav {
  width: 100%;
  font-size: 12px;
  text-align: center;
  margin-top: 2rem;
}

nav a.router-link-exact-active {
  color: var(--color-text);
}

nav a.router-link-exact-active:hover {
  background-color: transparent;
}

nav a {
  display: inline-block;
  padding: 0 1rem;
  border-left: 1px solid var(--color-border);
}

nav a:first-of-type {
  border: 0;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }

  nav {
    text-align: left;
    margin-left: -1rem;
    font-size: 1rem;

    padding: 1rem 0;
    margin-top: 1rem;
  }
}
</style>
