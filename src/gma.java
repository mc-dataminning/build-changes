import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gma {
   private final GameProfile a;
   private final Supplier<hls> b;
   private dkg c = dkg.e;
   private int d;
   @Nullable
   private xg e;
   private boolean f = true;
   @Nullable
   private xx g;
   private yc h;
   private int i;

   public gma(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.h = c($$1);
      Supplier<Supplier<hls>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hls> a(GameProfile $$0) {
      fqq $$1 = fqq.Q();
      hlt $$2 = $$1.an();
      CompletableFuture<Optional<hls>> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hls $$5 = hli.a($$0);
      return () -> {
         hls $$3x = $$3.getNow(Optional.empty()).orElse($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xx b() {
      return this.g;
   }

   public yc c() {
      return this.h;
   }

   public boolean d() {
      return this.g != null;
   }

   protected void a(xx $$0) {
      this.g = $$0;
      this.h = $$0.a(csm.b);
   }

   protected void a(boolean $$0) {
      this.g = null;
      this.h = c($$0);
   }

   private static yc c(boolean $$0) {
      return $$0 ? yc.c : yc.b;
   }

   public dkg e() {
      return this.c;
   }

   protected void a(dkg $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hls g() {
      return this.b.get();
   }

   @Nullable
   public fhc h() {
      return fqq.Q().s.R().e(this.a().getName());
   }

   public void a(@Nullable xg $$0) {
      this.e = $$0;
   }

   @Nullable
   public xg i() {
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
