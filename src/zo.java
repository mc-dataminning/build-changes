import java.util.List;

public record zo(ajb<cwe> c, eby d, List<zo.a> e) implements za {
   public static final xq<us, zo> a = za.a(zo::a, zo::new);
   public static final za.b<zo> b = za.a("debug/structures");

   private zo(us $$0) {
      this($$0.a(ki.aN), b($$0), $$0.a(zo.a::new));
   }

   private void a(us $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public za.b<zo> a() {
      return b;
   }

   static eby b(us $$0) {
      return new eby($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(us $$0, eby $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public ajb<cwe> b() {
      return this.c;
   }

   public eby c() {
      return this.d;
   }

   public List<zo.a> d() {
      return this.e;
   }

   public static record a(eby a, boolean b) {
      public a(us $$0) {
         this(zo.b($$0), $$0.readBoolean());
      }

      public void a(us $$0) {
         zo.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
