import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class zb implements ve<wx> {
   private final EnumSet<zb.a> a;
   private final List<zb.b> b;

   public zb(EnumSet<zb.a> $$0, Collection<aku> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(zb.b::new).toList();
   }

   public zb(zb.a $$0, aku $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new zb.b($$1));
   }

   public static zb a(Collection<aku> $$0) {
      EnumSet<zb.a> $$1 = EnumSet.of(zb.a.a, zb.a.b, zb.a.c, zb.a.d, zb.a.e, zb.a.f);
      return new zb($$1, $$0);
   }

   public zb(so $$0) {
      this.a = $$0.a(zb.a.class);
      this.b = $$0.a((so.a<zb.b>)($$0x -> {
         zb.c $$1 = new zb.c($$0x.p());

         for (zb.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, zb.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (zb.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public EnumSet<zb.a> a() {
      return this.a;
   }

   public List<zb.b> d() {
      return this.b;
   }

   public List<zb.b> e() {
      return this.a.contains(zb.a.a) ? this.b : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.a).add("entries", this.b).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll($$1.B());
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         $$0.a($$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(uc.a::a), ($$0, $$1) -> $$0.a($$1.g, uc.a::a)),
      c(($$0, $$1) -> $$0.e = cpy.a($$1.n()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.n(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(so::m), ($$0, $$1) -> $$0.a($$1.f(), so::a));

      final zb.a.a g;
      final zb.a.b h;

      private a(zb.a.a $$0, zb.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(zb.c var1, so var2);
      }

      public interface b {
         void write(so var1, zb.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, cpy e, @Nullable tl f, @Nullable uc.a g) {

      b(aku $$0) {
         this($$0.cv(), $$0.fR(), true, $$0.c.l(), $$0.e.b(), $$0.L(), x.a($$0.Z(), uc::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      cpy e;
      @Nullable
      tl f;
      @Nullable
      uc.a g;

      c(UUID $$0) {
         this.e = cpy.e;
         this.a = $$0;
      }

      zb.b a() {
         return new zb.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
