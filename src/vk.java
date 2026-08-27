import java.util.List;

public class vk implements uo<ur> {
   private final int a;
   private final int b;
   private final List<cfz> c;
   private final cfz d;

   public vk(int $$0, int $$1, hn<cfz> $$2, cfz $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = hn.a($$2.size(), cfz.b);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public vk(sf $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.m();
      this.c = $$0.a(hn::a, sf::r);
      this.d = $$0.r();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.a);
      $$0.d(this.b);
      $$0.a(this.c, sf::a);
      $$0.a(this.d);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<cfz> c() {
      return this.c;
   }

   public cfz d() {
      return this.d;
   }

   public int e() {
      return this.b;
   }
}
