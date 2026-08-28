import java.util.List;

public class grq extends grf<gve, fzm> {
   private final alb a;
   private final grq.a b;
   private final grq.b c;

   public grq(goo<gve, fzm> $$0, alb $$1, grq.a $$2, grq.b $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fcu $$0, ggv $$1, int $$2, gve $$3, float $$4, float $$5) {
      if (!$$3.u) {
         this.a();
         fcy $$6 = $$1.getBuffer(ghe.k(this.a));
         float $$7 = this.b.apply($$3, $$3.p);
         int $$8 = axn.a(azc.d($$7 * 255.0F), 255, 255, 255);
         this.d().a($$0, $$6, $$2, gnt.a($$3, 0.0F), $$8);
         this.b();
      }
   }

   private void a() {
      List<gab> $$0 = this.c.getPartsToDraw(this.d());
      this.d().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.d().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a {
      float apply(gve var1, float var2);
   }

   public interface b {
      List<gab> getPartsToDraw(fzm var1);
   }
}
