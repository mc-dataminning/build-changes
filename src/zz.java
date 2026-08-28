public record zz(aku a) implements zy {
   public static <T extends vl> ym<T, zz> a(aku $$0, int $$1) {
      return zy.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new zz($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public zy.b<zz> a() {
      return new zy.b<>(this.a);
   }

   public aku b() {
      return this.a;
   }
}
