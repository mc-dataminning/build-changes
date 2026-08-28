import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.UserApiService;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class gev {
   private final frd a;
   private final Set<UUID> b = Sets.newHashSet();
   private final UserApiService c;
   private final Map<String, UUID> d = Maps.newHashMap();
   private boolean e;
   private CompletableFuture<?> f = CompletableFuture.completedFuture(null);

   public gev(frd $$0, UserApiService $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public void a(UUID $$0) {
      this.b.add($$0);
   }

   public void b(UUID $$0) {
      this.b.remove($$0);
   }

   public boolean c(UUID $$0) {
      return this.d($$0) || this.e($$0);
   }

   public boolean d(UUID $$0) {
      return this.b.contains($$0);
   }

   public void a() {
      this.e = true;
      this.f = this.f.thenRunAsync(this.c::refreshBlockList, ag.i());
   }

   public void b() {
      this.e = false;
   }

   public boolean e(UUID $$0) {
      if (!this.e) {
         return false;
      } else {
         this.f.join();
         return this.c.isBlockedPlayer($$0);
      }
   }

   public Set<UUID> c() {
      return this.b;
   }

   public UUID a(String $$0) {
      return this.d.getOrDefault($$0, ag.e);
   }

   public void a(gmn $$0) {
      GameProfile $$1 = $$0.a();
      this.d.put($$1.getName(), $$1.getId());
      if (this.a.z instanceof gex $$2) {
         $$2.a($$0);
      }
   }

   public void f(UUID $$0) {
      if (this.a.z instanceof gex $$1) {
         $$1.a($$0);
      }
   }
}
