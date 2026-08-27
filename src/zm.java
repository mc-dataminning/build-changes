import java.util.List;

public record zm(aix<cvr> c, ebd d, List<zm.a> e) implements yy {
   public static final xo<uq, zm> a = yy.a(zm::a, zm::new);
   public static final yy.b<zm> b = yy.a("debug/structures");

   private zm(uq $$0) {
      this($$0.a(kg.aM), b($$0), $$0.a(zm.a::new));
   }

   private void a(uq $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public yy.b<zm> a() {
      return b;
   }

   static ebd b(uq $$0) {
      return new ebd($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(uq $$0, ebd $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public aix<cvr> b() {
      return this.c;
   }

   public ebd c() {
      return this.d;
   }

   public List<zm.a> d() {
      return this.e;
   }

   public static record a(ebd a, boolean b) {
      public a(uq $$0) {
         this(zm.b($$0), $$0.readBoolean());
      }

      public void a(uq $$0) {
         zm.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
