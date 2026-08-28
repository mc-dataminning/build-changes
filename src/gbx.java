import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gbx {
   private final GameProfile a;
   private final Supplier<gyh> b;
   private deg c = deg.e;
   private int d;
   @Nullable
   private xe e;
   @Nullable
   private xv f;
   private ya g;
   private int h;

   public gbx(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gyh>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gyh> a(GameProfile $$0) {
      fip $$1 = fip.Q();
      gyi $$2 = $$1.an();
      CompletableFuture<gyh> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gyh $$5 = gxy.a($$0);
      return () -> {
         gyh $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xv b() {
      return this.f;
   }

   public ya c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xv $$0) {
      this.f = $$0;
      this.g = $$0.a(coa.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static ya b(boolean $$0) {
      return $$0 ? ya.c : ya.b;
   }

   public deg e() {
      return this.c;
   }

   protected void a(deg $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gyh g() {
      return this.b.get();
   }

   @Nullable
   public ezw h() {
      return fip.Q().s.O().e(this.a().getName());
   }

   public void a(@Nullable xe $$0) {
      this.e = $$0;
   }

   @Nullable
   public xe i() {
      return this.e;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public int j() {
      return this.h;
   }
}
