import java.util.List;
import javax.annotation.Nullable;

public class fya extends fvi {
   private static final int a = 310;
   private static final int b = 25;
   private static final wp c = wp.c("menu.server_links.title");
   private final fvi d;
   @Nullable
   private fya.a s;
   final fte u = new fte(this);
   final alm v;

   public fya(fvi $$0, alm $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aR_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new fya.a(this.m, this.n, this));
      this.u.b(fpq.a(wo.k, $$0 -> this.aO_()).a(200).a());
      this.u.a($$1 -> {
         fpo var10000 = this.c($$1);
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
   public void aO_() {
      this.m.a(this.d);
   }

   static class a extends fpw<fya.b> {
      public a(fmg $$0, int $$1, fya $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new fya.b($$2, $$1x)));
      }

      @Override
      public int a() {
         return 310;
      }

      @Override
      public void a(int $$0, fte $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aH_().forEach($$1x -> $$1x.a.j($$2));
      }
   }

   static class b extends fpw.a<fya.b> {
      final fpo a;

      b(fvi $$0, alm.a $$1) {
         this.a = fpq.a($$1.a(), fuf.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.k($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends frn> aH_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends ftl> b() {
         return List.of(this.a);
      }
   }
}
