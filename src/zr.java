import java.util.List;

public class zr implements xd<yx> {
   private final int a;
   private final int b;
   private final List<cmr> c;
   private final cmr d;

   public zr(int $$0, int $$1, iq<cmr> $$2, cmr $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = iq.a($$2.size(), cmr.f);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public zr(ug $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.n();
      this.c = $$0.a(iq::a, ug::r);
      this.d = $$0.r();
   }

   @Override
   public void a(ug $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, ug::a);
      $$0.a(this.d);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<cmr> d() {
      return this.c;
   }

   public cmr e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}
