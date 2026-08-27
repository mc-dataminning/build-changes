import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class wy implements uo<ur> {
   private final EnumSet<wy.a> a;
   private final List<wy.b> b;

   public wy(EnumSet<wy.a> $$0, Collection<aig> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(wy.b::new).toList();
   }

   public wy(wy.a $$0, aig $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new wy.b($$1));
   }

   public static wy a(Collection<aig> $$0) {
      EnumSet<wy.a> $$1 = EnumSet.of(wy.a.a, wy.a.b, wy.a.c, wy.a.d, wy.a.e, wy.a.f);
      return new wy($$1, $$0);
   }

   public wy(sf $$0) {
      this.a = $$0.a(wy.a.class);
      this.b = $$0.a((sf.a<wy.b>)($$0x -> {
         wy.c $$1 = new wy.c($$0x.o());

         for (wy.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a, wy.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (wy.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public EnumSet<wy.a> a() {
      return this.a;
   }

   public List<wy.b> c() {
      return this.b;
   }

   public List<wy.b> d() {
      return this.a.contains(wy.a.a) ? this.b : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.a).add("entries", this.b).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.e(16));
         $$2.getProperties().putAll($$1.A());
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         $$0.a($$1.b().getName(), 16);
         $$0.a($$1.b().getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(tm.a::a), ($$0, $$1) -> $$0.a($$1.g, tm.a::a)),
      c(($$0, $$1) -> $$0.e = cmj.a($$1.m()), ($$0, $$1) -> $$0.d($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.writeBoolean($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.m(), ($$0, $$1) -> $$0.d($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(sf::l), ($$0, $$1) -> $$0.a($$1.f(), sf::a));

      final wy.a.a g;
      final wy.a.b h;

      private a(wy.a.a $$0, wy.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(wy.c var1, sf var2);
      }

      public interface b {
         void write(sf var1, wy.b var2);
      }
   }

   public static record b(UUID a, GameProfile b, boolean c, int d, cmj e, @Nullable sw f, @Nullable tm.a g) {

      b(aig $$0) {
         this($$0.ct(), $$0.fM(), true, $$0.f, $$0.e.b(), $$0.J(), x.a($$0.X(), tm::b));
      }
   }

   static class c {
      final UUID a;
      GameProfile b;
      boolean c;
      int d;
      cmj e;
      @Nullable
      sw f;
      @Nullable
      tm.a g;

      c(UUID $$0) {
         this.e = cmj.e;
         this.a = $$0;
         this.b = new GameProfile($$0, null);
      }

      wy.b a() {
         return new wy.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
