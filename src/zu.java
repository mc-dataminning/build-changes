import java.util.List;

public class zu implements xf<za> {
   private final int a;
   private final int b;
   private final List<cmy> c;
   private final cmy d;

   public zu(int $$0, int $$1, iq<cmy> $$2, cmy $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = iq.a($$2.size(), cmy.f);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public zu(ui $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.n();
      this.c = $$0.a(iq::a, ui::r);
      this.d = $$0.r();
   }

   @Override
   public void a(ui $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, ui::a);
      $$0.a(this.d);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<cmy> d() {
      return this.c;
   }

   public cmy e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}
