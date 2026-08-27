public record zp(ajt a) implements zo {
   public static <T extends vg> ye<T, zp> a(ajt $$0, int $$1) {
      return zo.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new zp($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public zo.b<zp> a() {
      return new zo.b<>(this.a);
   }

   public ajt b() {
      return this.a;
   }
}
