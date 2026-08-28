import java.util.List;
import javax.annotation.Nullable;

public class fwj extends ftr {
   private static final int a = 310;
   private static final int b = 25;
   private static final xv c = xv.c("menu.server_links.title");
   private final ftr d;
   @Nullable
   private fwj.a s;
   final frn u = new frn(this);
   final amr v;

   public fwj(ftr $$0, amr $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aT_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new fwj.a(this.m, this.n, this));
      this.u.b(fny.a(xu.k, $$0 -> this.aP_()).a(200).a());
      this.u.a($$1 -> {
         fnw var10000 = this.c($$1);
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
   public void aP_() {
      this.m.a(this.d);
   }

   static class a extends foe<fwj.b> {
      public a(flz $$0, int $$1, fwj $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new fwj.b($$2, $$1x)));
      }

      @Override
      public int a() {
         return 310;
      }

      @Override
      public void a(int $$0, frn $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aI_().forEach($$1x -> $$1x.a.m($$2));
      }
   }

   static class b extends foe.a<fwj.b> {
      final fnw a;

      b(ftr $$0, amr.a $$1) {
         this.a = fny.a($$1.a(), fso.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.n($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fpw> aI_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fru> b() {
         return List.of(this.a);
      }
   }
}
