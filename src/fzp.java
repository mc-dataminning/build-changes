import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzp extends fuk {
   private static final Logger a = LogUtils.getLogger();
   private static final ToIntFunction<akt<dgi>> b = af.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.put(dgi.i, -13408734);
      $$0.put(dgi.j, -10075085);
      $$0.put(dgi.k, -8943531);
      $$0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer c;
   private final brx d;

   @Nullable
   public static fzp a(flj $$0, BooleanConsumer $$1, DataFixer $$2, evf.c $$3, boolean $$4) {
      try {
         fzw $$5 = $$0.x();
         aua $$6 = aud.a($$3);

         fzp var10;
         try (alt $$7 = $$5.a($$3.h(), false, $$6)) {
            evl $$8 = $$7.d();
            kf.b $$9 = $$7.c().a();
            $$3.a($$9, $$8);
            var10 = new fzp($$1, $$2, $$3, $$8.J(), $$4, $$9);
         }

         return var10;
      } catch (Exception var13) {
         a.warn("Failed to load datapacks, can't optimize world", var13);
         return null;
      }
   }

   private fzp(BooleanConsumer $$0, DataFixer $$1, evf.c $$2, dgm $$3, boolean $$4, kf $$5) {
      super(wo.a("optimizeWorld.title", $$3.a()));
      this.c = $$0;
      this.d = new brx($$2, $$1, $$5, $$4, false);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.c(fos.a(wn.e, $$0 -> {
         this.d.a();
         this.c.accept(false);
      }).a(this.n / 2 - 100, this.o / 4 + 150, 200, 20).a());
   }

   @Override
   public void e() {
      if (this.d.b()) {
         this.c.accept(true);
      }
   }

   @Override
   public void aO_() {
      this.c.accept(false);
   }

   @Override
   public void aI_() {
      this.d.a();
      this.d.close();
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
      int $$4 = this.n / 2 - 150;
      int $$5 = this.n / 2 + 150;
      int $$6 = this.o / 4 + 100;
      int $$7 = $$6 + 10;
      $$0.a(this.p, this.d.h(), this.n / 2, $$6 - 9 - 2, 10526880);
      if (this.d.e() > 0) {
         $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
         $$0.b(this.p, wo.a("optimizeWorld.info.converted", this.d.f()), $$4, 40, 10526880);
         $$0.b(this.p, wo.a("optimizeWorld.info.skipped", this.d.g()), $$4, 40 + 9 + 3, 10526880);
         $$0.b(this.p, wo.a("optimizeWorld.info.total", this.d.e()), $$4, 40 + (9 + 3) * 2, 10526880);
         int $$8 = 0;

         for (akt<dgi> $$9 : this.d.c()) {
            int $$10 = ayz.d(this.d.a($$9) * (float)($$5 - $$4));
            $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.applyAsInt($$9));
            $$8 += $$10;
         }

         int $$11 = this.d.f() + this.d.g();
         wo $$12 = wo.a("optimizeWorld.progress.counter", $$11, this.d.e());
         wo $$13 = wo.a("optimizeWorld.progress.percentage", ayz.d(this.d.d() * 100.0F));
         $$0.a(this.p, $$12, this.n / 2, $$6 + 2 * 9 + 2, 10526880);
         $$0.a(this.p, $$13, this.n / 2, $$6 + ($$7 - $$6) / 2 - 9 / 2, 10526880);
      }
   }
}
