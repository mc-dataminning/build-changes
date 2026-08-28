import java.util.List;
import javax.annotation.Nullable;

public class gck extends fzq {
   private static final int a = 310;
   private static final int b = 25;
   private static final xg c = xg.c("menu.server_links.title");
   private final fzq d;
   @Nullable
   private gck.a s;
   final fxm u = new fxm(this);
   final amj v;

   public gck(fzq $$0, amj $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aT_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new gck.a(this.m, this.n, this));
      this.u.b(fty.a(xf.k, $$0 -> this.aQ_()).a(200).a());
      this.u.a($$1 -> {
         ftw var10000 = this.c($$1);
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
   public void aQ_() {
      this.m.a(this.d);
   }

   static class a extends fue<gck.b> {
      public a(fqq $$0, int $$1, gck $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new gck.b($$2, $$1x)));
      }

      @Override
      public int a() {
         return 310;
      }

      @Override
      public void a(int $$0, fxm $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aJ_().forEach($$1x -> $$1x.a.j($$2));
      }
   }

   static class b extends fue.a<gck.b> {
      final ftw a;

      b(fzq $$0, amj.a $$1) {
         this.a = fty.a($$1.a(), fyn.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.k($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fvv> aJ_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fxt> b() {
         return List.of(this.a);
      }
   }
}
