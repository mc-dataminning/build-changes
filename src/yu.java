import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class yu implements ux<wp> {
   private final EnumSet<yu.a> a;
   private final List<yu.b> b;

   public yu(EnumSet<yu.a> $$0, Collection<akl> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(yu.b::new).toList();
   }

   public yu(yu.a $$0, akl $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new yu.b($$1));
   }

   public static yu a(Collection<akl> $$0) {
      EnumSet<yu.a> $$1 = EnumSet.of(yu.a.a, yu.a.b, yu.a.c, yu.a.d, yu.a.e, yu.a.f);
      return new yu($$1, $$0);
   }

   public yu(si $$0) {
      this.a = $$0.a(yu.a.class);
      this.b = $$0.a((si.a<yu.b>)($$0x -> {
         yu.c $$1 = new yu.c($$0x.o());

         for (yu.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a, yu.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (yu.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public EnumSet<yu.a> a() {
      return this.a;
   }

   public List<yu.b> d() {
      return this.b;
   }

   public List<yu.b> e() {
      return this.a.contains(yu.a.a) ? this.b : List.of();
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
      b(($$0, $$1) -> $$0.g = $$1.c(tv.a::a), ($$0, $$1) -> $$0.a($$1.g, tv.a::a)),
      c(($$0, $$1) -> $$0.e = cpi.a($$1.m()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.m(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(si::l), ($$0, $$1) -> $$0.a($$1.f(), si::a));

      final yu.a.a g;
      final yu.a.b h;

      private a(yu.a.a $$0, yu.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(yu.c var1, si var2);
      }

      public interface b {
         void write(si var1, yu.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, cpi e, @Nullable tf f, @Nullable tv.a g) {

      b(akl $$0) {
         this($$0.cv(), $$0.fP(), true, $$0.c.l(), $$0.e.b(), $$0.K(), x.a($$0.Z(), tv::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      cpi e;
      @Nullable
      tf f;
      @Nullable
      tv.a g;

      c(UUID $$0) {
         this.e = cpi.e;
         this.a = $$0;
      }

      yu.b a() {
         return new yu.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
