public interface hmk {
   hjq a(hlx var1, hmb var2);

   hjq a(String var1, hmb var2);

   default hjq a(gsl $$0, String $$1, hmb $$2) {
      hlx $$3 = $$0.a($$1);
      return $$3 != null ? this.a($$3, $$2) : this.a($$1, $$2);
   }
}
