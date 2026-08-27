import java.util.List;

public record xi(afv<cqz> b, dvs c, List<xi.a> d) implements wu {
   public static final afw a = new afw("debug/structures");

   public xi(tl $$0) {
      this($$0.a(jz.aI), b($$0), $$0.a(xi.a::new));
   }

   @Override
   public void a(tl $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public afw a() {
      return a;
   }

   static dvs b(tl $$0) {
      return new dvs($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(tl $$0, dvs $$1) {
      $$0.p($$1.g());
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
   }

   public static record a(dvs a, boolean b) {
      public a(tl $$0) {
         this(xi.b($$0), $$0.readBoolean());
      }

      public void a(tl $$0) {
         xi.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
