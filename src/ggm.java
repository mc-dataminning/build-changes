import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ggm {
   private final GameProfile a;
   private final Supplier<hfv> b;
   private dgg c = dgg.e;
   private int d;
   @Nullable
   private wp e;
   private boolean f = true;
   @Nullable
   private xg g;
   private xl h;
   private int i;

   public ggm(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.h = c($$1);
      Supplier<Supplier<hfv>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hfv> a(GameProfile $$0) {
      flk $$1 = flk.Q();
      hfw $$2 = $$1.an();
      CompletableFuture<Optional<hfv>> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hfv $$5 = hfm.a($$0);
      return () -> {
         hfv $$3x = $$3.getNow(Optional.empty()).orElse($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xg b() {
      return this.g;
   }

   public xl c() {
      return this.h;
   }

   public boolean d() {
      return this.g != null;
   }

   protected void a(xg $$0) {
      this.g = $$0;
      this.h = $$0.a(cpb.b);
   }

   protected void a(boolean $$0) {
      this.g = null;
      this.h = c($$0);
   }

   private static xl c(boolean $$0) {
      return $$0 ? xl.c : xl.b;
   }

   public dgg e() {
      return this.c;
   }

   protected void a(dgg $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hfv g() {
      return this.b.get();
   }

   @Nullable
   public fcb h() {
      return flk.Q().s.R().e(this.a().getName());
   }

   public void a(@Nullable wp $$0) {
      this.e = $$0;
   }

   @Nullable
   public wp i() {
      return this.e;
   }

   public void b(boolean $$0) {
      this.f = $$0;
   }

   public boolean j() {
      return this.f;
   }

   public void b(int $$0) {
      this.i = $$0;
   }

   public int k() {
      return this.i;
   }
}
