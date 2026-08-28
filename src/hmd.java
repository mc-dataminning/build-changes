public interface hmd {
   hjk a(hlq var1, hlu var2);

   hjk a(String var1, hlu var2);

   default hjk a(gsg $$0, String $$1, hlu $$2) {
      hlq $$3 = $$0.a($$1);
      return $$3 != null ? this.a($$3, $$2) : this.a($$1, $$2);
   }
}
