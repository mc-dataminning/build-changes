import java.util.List;

public record yl(ahc<cti> b, dyr c, List<yl.a> d) implements xx {
   public static final ahd a = new ahd("debug/structures");

   public yl(ug $$0) {
      this($$0.a(ke.aM), b($$0), $$0.a(yl.a::new));
   }

   @Override
   public void a(ug $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public ahd a() {
      return a;
   }

   static dyr b(ug $$0) {
      return new dyr($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(ug $$0, dyr $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public static record a(dyr a, boolean b) {
      public a(ug $$0) {
         this(yl.b($$0), $$0.readBoolean());
      }

      public void a(ug $$0) {
         yl.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
