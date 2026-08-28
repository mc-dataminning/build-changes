import java.util.List;
import javax.annotation.Nullable;

public class gbm extends fys {
   private static final int a = 310;
   private static final int b = 25;
   private static final wy c = wy.c("menu.server_links.title");
   private final fys d;
   @Nullable
   private gbm.a s;
   final fwo u = new fwo(this);
   final aly v;

   public gbm(fys $$0, aly $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aO_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new gbm.a(this.m, this.n, this));
      this.u.b(fta.a(wx.k, $$0 -> this.aL_()).a(200).a());
      this.u.a($$1 -> {
         fsy var10000 = this.c($$1);
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
   public void aL_() {
      this.m.a(this.d);
   }

   static class a extends ftg<gbm.b> {
      public a(fpt $$0, int $$1, gbm $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new gbm.b($$2, $$1x)));
      }

      @Override
      public int a() {
         return 310;
      }

      @Override
      public void a(int $$0, fwo $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aE_().forEach($$1x -> $$1x.a.j($$2));
      }
   }

   static class b extends ftg.a<gbm.b> {
      final fsy a;

      b(fys $$0, aly.a $$1) {
         this.a = fta.a($$1.a(), fxp.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.k($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fux> aE_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fwv> b() {
         return List.of(this.a);
      }
   }
}
