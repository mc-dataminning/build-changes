public record yo(sw a, boolean b) implements uo<ur> {
   public yo(sf $$0) {
      this($$0.l(), $$0.readBoolean());
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.writeBoolean(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   @Override
   public boolean b() {
      return true;
   }

   public boolean c() {
      return this.b;
   }
}
