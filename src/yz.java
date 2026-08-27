public record yz(aiy a) implements yy {
   public static <T extends uq> xo<T, yz> a(aiy $$0, int $$1) {
      return yy.a(($$0x, $$1x) -> {
      }, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.j($$3);
            return new yz($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public yy.b<yz> a() {
      return new yy.b<>(this.a);
   }

   public aiy b() {
      return this.a;
   }
}
