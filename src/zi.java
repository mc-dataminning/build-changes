import java.util.List;

public class zi implements wu<yo> {
   private final int a;
   private final int b;
   private final List<cmh> c;
   private final cmh d;

   public zi(int $$0, int $$1, io<cmh> $$2, cmh $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = io.a($$2.size(), cmh.f);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public zi(ue $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.n();
      this.c = $$0.a(io::a, ue::r);
      this.d = $$0.r();
   }

   @Override
   public void a(ue $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, ue::a);
      $$0.a(this.d);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<cmh> d() {
      return this.c;
   }

   public cmh e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}
