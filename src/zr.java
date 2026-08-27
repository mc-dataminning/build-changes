public record zr(ajv a) implements zq {
   public static <T extends vi> yg<T, zr> a(ajv $$0, int $$1) {
      return zq.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new zr($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public zq.b<zr> a() {
      return new zq.b<>(this.a);
   }

   public ajv b() {
      return this.a;
   }
}
