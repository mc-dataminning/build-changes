import java.util.List;

public record zq(ajg<cwz> c, ecu d, List<zq.a> e) implements zc {
   public static final xs<uu, zq> a = zc.a(zq::a, zq::new);
   public static final zc.b<zq> b = zc.a("debug/structures");

   private zq(uu $$0) {
      this($$0.a(kj.aN), b($$0), $$0.a(zq.a::new));
   }

   private void a(uu $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public zc.b<zq> a() {
      return b;
   }

   static ecu b(uu $$0) {
      return new ecu($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(uu $$0, ecu $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public ajg<cwz> b() {
      return this.c;
   }

   public ecu c() {
      return this.d;
   }

   public List<zq.a> d() {
      return this.e;
   }

   public static record a(ecu a, boolean b) {
      public a(uu $$0) {
         this(zq.b($$0), $$0.readBoolean());
      }

      public void a(uu $$0) {
         zq.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
