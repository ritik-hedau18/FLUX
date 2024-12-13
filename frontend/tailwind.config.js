/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      colors: {
        dark: {
          900: '#07050f',
          800: '#0e0b1d',
          700: '#17132e',
          600: '#231e44'
        },
        flux: {
          orange: '#F97316',
          teal: '#14B8A6',
          purple: '#A855F7',
          sky: '#0EA5E9'
        }
      }
    },
  },
  plugins: [],
}
