import java.util.List;
import javax.annotation.Nullable;

public class gao extends fxu {
   private static final int a = 310;
   private static final int b = 25;
   private static final wy c = wy.c("menu.server_links.title");
   private final fxu d;
   @Nullable
   private gao.a s;
   final fvq u = new fvq(this);
   final aly v;

   public gao(fxu $$0, aly $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aN_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new gao.a(this.m, this.n, this));
      this.u.b(fsc.a(wx.k, $$0 -> this.aK_()).a(200).a());
      this.u.a($$1 -> {
         fsa var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      if (this.s != null) {
         this.s.a(this.n, this.u);
      }
   }

   @Override
   public void aK_() {
      this.m.a(this.d);
   }

   static class a extends fsi<gao.b> {
      public a(fos $$0, int $$1, gao $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new gao.b($$2, $$1x)));
      }

      @Override
      public int a() {
         return 310;
      }

      @Override
      public void a(int $$0, fvq $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aD_().forEach($$1x -> $$1x.a.j($$2));
      }
   }

   static class b extends fsi.a<gao.b> {
      final fsa a;

      b(fxu $$0, aly.a $$1) {
         this.a = fsc.a($$1.a(), fwr.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.k($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends ftz> aD_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fvx> b() {
         return List.of(this.a);
      }
   }
}
