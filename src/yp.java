import java.util.List;

public record yp(ahg<ctx> b, dzg c, List<yp.a> d) implements yb {
   public static final ahh a = new ahh("debug/structures");

   public yp(uj $$0) {
      this($$0.a(ke.aM), b($$0), $$0.a(yp.a::new));
   }

   @Override
   public void a(uj $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public ahh a() {
      return a;
   }

   static dzg b(uj $$0) {
      return new dzg($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(uj $$0, dzg $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public static record a(dzg a, boolean b) {
      public a(uj $$0) {
         this(yp.b($$0), $$0.readBoolean());
      }

      public void a(uj $$0) {
         yp.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
