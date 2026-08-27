public record zb(ajc a) implements za {
   public static <T extends us> xq<T, zb> a(ajc $$0, int $$1) {
      return za.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new zb($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public za.b<zb> a() {
      return new za.b<>(this.a);
   }

   public ajc b() {
      return this.a;
   }
}
