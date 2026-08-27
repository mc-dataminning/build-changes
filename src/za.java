import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class za implements vd<ww> {
   private final EnumSet<za.a> a;
   private final List<za.b> b;

   public za(EnumSet<za.a> $$0, Collection<akr> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(za.b::new).toList();
   }

   public za(za.a $$0, akr $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new za.b($$1));
   }

   public static za a(Collection<akr> $$0) {
      EnumSet<za.a> $$1 = EnumSet.of(za.a.a, za.a.b, za.a.c, za.a.d, za.a.e, za.a.f);
      return new za($$1, $$0);
   }

   public za(so $$0) {
      this.a = $$0.a(za.a.class);
      this.b = $$0.a((so.a<za.b>)($$0x -> {
         za.c $$1 = new za.c($$0x.o());

         for (za.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, za.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (za.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public EnumSet<za.a> a() {
      return this.a;
   }

   public List<za.b> d() {
      return this.b;
   }

   public List<za.b> e() {
      return this.a.contains(za.a.a) ? this.b : List.of();
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
      b(($$0, $$1) -> $$0.g = $$1.c(ub.a::a), ($$0, $$1) -> $$0.a($$1.g, ub.a::a)),
      c(($$0, $$1) -> $$0.e = cps.a($$1.m()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.m(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(so::l), ($$0, $$1) -> $$0.a($$1.f(), so::a));

      final za.a.a g;
      final za.a.b h;

      private a(za.a.a $$0, za.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(za.c var1, so var2);
      }

      public interface b {
         void write(so var1, za.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, cps e, @Nullable tl f, @Nullable ub.a g) {

      b(akr $$0) {
         this($$0.cv(), $$0.fQ(), true, $$0.c.l(), $$0.e.b(), $$0.L(), x.a($$0.Z(), ub::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      cps e;
      @Nullable
      tl f;
      @Nullable
      ub.a g;

      c(UUID $$0) {
         this.e = cps.e;
         this.a = $$0;
      }

      za.b a() {
         return new za.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
