public record zd(ajh a) implements zc {
   public static <T extends uu> xs<T, zd> a(ajh $$0, int $$1) {
      return zc.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new zd($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public zc.b<zd> a() {
      return new zc.b<>(this.a);
   }

   public ajh b() {
      return this.a;
   }
}
