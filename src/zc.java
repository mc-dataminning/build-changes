import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class zc implements vf<wy> {
   private final EnumSet<zc.a> a;
   private final List<zc.b> b;

   public zc(EnumSet<zc.a> $$0, Collection<akt> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(zc.b::new).toList();
   }

   public zc(zc.a $$0, akt $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new zc.b($$1));
   }

   public static zc a(Collection<akt> $$0) {
      EnumSet<zc.a> $$1 = EnumSet.of(zc.a.a, zc.a.b, zc.a.c, zc.a.d, zc.a.e, zc.a.f);
      return new zc($$1, $$0);
   }

   public zc(sq $$0) {
      this.a = $$0.a(zc.a.class);
      this.b = $$0.a((sq.a<zc.b>)($$0x -> {
         zc.c $$1 = new zc.c($$0x.o());

         for (zc.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, zc.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (zc.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public EnumSet<zc.a> a() {
      return this.a;
   }

   public List<zc.b> d() {
      return this.b;
   }

   public List<zc.b> e() {
      return this.a.contains(zc.a.a) ? this.b : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.a).add("entries", this.b).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll($$1.A());
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         $$0.a($$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(ud.a::a), ($$0, $$1) -> $$0.a($$1.g, ud.a::a)),
      c(($$0, $$1) -> $$0.e = cpu.a($$1.m()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.m(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(sq::l), ($$0, $$1) -> $$0.a($$1.f(), sq::a));

      final zc.a.a g;
      final zc.a.b h;

      private a(zc.a.a $$0, zc.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(zc.c var1, sq var2);
      }

      public interface b {
         void write(sq var1, zc.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, cpu e, @Nullable tn f, @Nullable ud.a g) {

      b(akt $$0) {
         this($$0.cv(), $$0.fQ(), true, $$0.c.l(), $$0.e.b(), $$0.L(), x.a($$0.Z(), ud::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      cpu e;
      @Nullable
      tn f;
      @Nullable
      ud.a g;

      c(UUID $$0) {
         this.e = cpu.e;
         this.a = $$0;
      }

      zc.b a() {
         return new zc.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
