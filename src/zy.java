import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class zy implements wb<xu> {
   private final EnumSet<zy.a> a;
   private final List<zy.b> b;

   public zy(EnumSet<zy.a> $$0, Collection<alr> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(zy.b::new).toList();
   }

   public zy(zy.a $$0, alr $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new zy.b($$1));
   }

   public static zy a(Collection<alr> $$0) {
      EnumSet<zy.a> $$1 = EnumSet.of(zy.a.a, zy.a.b, zy.a.c, zy.a.d, zy.a.e, zy.a.f);
      return new zy($$1, $$0);
   }

   public zy(tl $$0) {
      this.a = $$0.a(zy.a.class);
      this.b = $$0.a((tl.a<zy.b>)($$0x -> {
         zy.c $$1 = new zy.c($$0x.p());

         for (zy.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a, zy.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (zy.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public EnumSet<zy.a> a() {
      return this.a;
   }

   public List<zy.b> d() {
      return this.b;
   }

   public List<zy.b> e() {
      return this.a.contains(zy.a.a) ? this.b : List.of();
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
      b(($$0, $$1) -> $$0.g = $$1.c(uz.a::a), ($$0, $$1) -> $$0.a($$1.g, uz.a::a)),
      c(($$0, $$1) -> $$0.e = cqw.a($$1.n()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.n(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(tl::m), ($$0, $$1) -> $$0.a($$1.f(), tl::a));

      final zy.a.a g;
      final zy.a.b h;

      private a(zy.a.a $$0, zy.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(zy.c var1, tl var2);
      }

      public interface b {
         void write(tl var1, zy.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, cqw e, @Nullable ui f, @Nullable uz.a g) {

      b(alr $$0) {
         this($$0.cv(), $$0.fR(), true, $$0.c.l(), $$0.e.b(), $$0.L(), x.a($$0.Z(), uz::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      cqw e;
      @Nullable
      ui f;
      @Nullable
      uz.a g;

      c(UUID $$0) {
         this.e = cqw.e;
         this.a = $$0;
      }

      zy.b a() {
         return new zy.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
