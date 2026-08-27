import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class yt implements uw<wo> {
   private final EnumSet<yt.a> a;
   private final List<yt.b> b;

   public yt(EnumSet<yt.a> $$0, Collection<akj> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(yt.b::new).toList();
   }

   public yt(yt.a $$0, akj $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new yt.b($$1));
   }

   public static yt a(Collection<akj> $$0) {
      EnumSet<yt.a> $$1 = EnumSet.of(yt.a.a, yt.a.b, yt.a.c, yt.a.d, yt.a.e, yt.a.f);
      return new yt($$1, $$0);
   }

   public yt(sh $$0) {
      this.a = $$0.a(yt.a.class);
      this.b = $$0.a((sh.a<yt.b>)($$0x -> {
         yt.c $$1 = new yt.c($$0x.o());

         for (yt.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a, yt.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (yt.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public EnumSet<yt.a> a() {
      return this.a;
   }

   public List<yt.b> d() {
      return this.b;
   }

   public List<yt.b> e() {
      return this.a.contains(yt.a.a) ? this.b : List.of();
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
      b(($$0, $$1) -> $$0.g = $$1.c(tu.a::a), ($$0, $$1) -> $$0.a($$1.g, tu.a::a)),
      c(($$0, $$1) -> $$0.e = cph.a($$1.m()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.m(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(sh::l), ($$0, $$1) -> $$0.a($$1.f(), sh::a));

      final yt.a.a g;
      final yt.a.b h;

      private a(yt.a.a $$0, yt.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(yt.c var1, sh var2);
      }

      public interface b {
         void write(sh var1, yt.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, cph e, @Nullable te f, @Nullable tu.a g) {

      b(akj $$0) {
         this($$0.cv(), $$0.fP(), true, $$0.c.k(), $$0.e.b(), $$0.K(), x.a($$0.Z(), tu::b));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      cph e;
      @Nullable
      te f;
      @Nullable
      tu.a g;

      c(UUID $$0) {
         this.e = cph.e;
         this.a = $$0;
      }

      yt.b a() {
         return new yt.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
