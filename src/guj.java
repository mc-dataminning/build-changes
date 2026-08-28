import java.util.List;

public class guj extends gty<gxy, gbw> {
   private final alj a;
   private final guj.a b;
   private final guj.b c;

   public guj(grh<gxy, gbw> $$0, alj $$1, guj.a $$2, guj.b $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fer $$0, gjg $$1, int $$2, gxy $$3, float $$4, float $$5) {
      if (!$$3.u) {
         this.a();
         fev $$6 = $$1.getBuffer(gjq.j(this.a));
         float $$7 = this.b.apply($$3, $$3.p);
         int $$8 = axx.a(azm.d($$7 * 255.0F), 255, 255, 255);
         this.d().a($$0, $$6, $$2, gql.a($$3, 0.0F), $$8);
         this.b();
      }
   }

   private void a() {
      List<gcl> $$0 = this.c.getPartsToDraw(this.d());
      this.d().f().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.d().f().forEach($$0 -> $$0.l = false);
   }

   public interface a {
      float apply(gxy var1, float var2);
   }

   public interface b {
      List<gcl> getPartsToDraw(gbw var1);
   }
}
