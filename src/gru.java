public abstract class gru extends grt implements gsm {
   private boolean n;

   protected gru(avy $$0, awa $$1, azf $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean m() {
      return this.n;
   }

   protected final void n() {
      this.n = true;
      this.i = false;
   }
}
