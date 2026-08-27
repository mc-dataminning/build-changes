import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class yx implements va<ws> {
   private final EnumSet<yx.a> a;
   private final List<yx.b> b;

   public yx(EnumSet<yx.a> $$0, Collection<ako> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(yx.b::new).toList();
   }

   public yx(yx.a $$0, ako $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new yx.b($$1));
   }

   public static yx a(Collection<ako> $$0) {
      EnumSet<yx.a> $$1 = EnumSet.of(yx.a.a, yx.a.b, yx.a.c, yx.a.d, yx.a.e, yx.a.f);
      return new yx($$1, $$0);
   }

   public yx(sl $$0) {
      this.a = $$0.a(yx.a.class);
      this.b = $$0.a((sl.a<yx.b>)($$0x -> {
         yx.c $$1 = new yx.c($$0x.o());

         for (yx.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a, yx.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (yx.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public EnumSet<yx.a> a() {
      return this.a;
   }

   public List<yx.b> d() {
      return this.b;
   }

   public List<yx.b> e() {
      return this.a.contains(yx.a.a) ? this.b : List.of();
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
      b(($$0, $$1) -> $$0.g = $$1.c(ty.a::a), ($$0, $$1) -> $$0.a($$1.g, ty.a::a)),
      c(($$0, $$1) -> $$0.e = cpn.a($$1.m()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.m(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(sl::l), ($$0, $$1) -> $$0.a($$1.f(), sl::a));

      final yx.a.a g;
      final yx.a.b h;

      private a(yx.a.a $$0, yx.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(yx.c var1, sl var2);
      }

      public interface b {
         void write(sl var1, yx.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, cpn e, @Nullable ti f, @Nullable ty.a g) {

      b(ako $$0) {
         this($$0.cv(), $$0.fP(), true, $$0.c.l(), $$0.e.b(), $$0.K(), x.a($$0.Z(), ty::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      cpn e;
      @Nullable
      ti f;
      @Nullable
      ty.a g;

      c(UUID $$0) {
         this.e = cpn.e;
         this.a = $$0;
      }

      yx.b a() {
         return new yx.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
