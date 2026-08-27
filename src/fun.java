import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fun implements yv {
   private static final wi i = wi.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final fby a;
   protected final vg b;
   @Nullable
   protected final fve c;
   @Nullable
   protected String d;
   protected final gqw e;
   @Nullable
   protected final fjx f;
   protected boolean g;
   private final List<fun.a> k = new ArrayList<>();
   protected final Map<ajv, byte[]> h;

   protected fun(fby $$0, vg $$1, fuu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
   }

   @Override
   public void a(yy $$0) {
      this.a(new zj($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(yz $$0) {
      ys.a($$0, this, this.a);
      this.b(new zk($$0.b()));
   }

   @Override
   public void a(yw $$0) {
      zq $$1 = $$0.b();
      if (!($$1 instanceof zr)) {
         ys.a($$0, this, this.a);
         if ($$1 instanceof zo $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(zq var1);

   @Override
   public void a(zb $$0) {
      ys.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new zl($$1, zl.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fve.a $$5 = this.c != null ? this.c.b() : fve.a.c;
         if ($$5 != fve.a.c && (!$$4 || $$5 != fve.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(za $$0) {
      ys.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static wi a(wi $$0, @Nullable wi $$1) {
      return (wi)($$1 == null ? $$0 : wi.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(aav $$0) {
      ys.a($$0, this, this.a);
      this.b.a(new aay($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(zc $$0) {
      ys.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zd $$0) {
      ys.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.g = true;
         this.b.a(wi.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         fwh $$1 = new fwh($$0.b(), $$0.e());
         fiq.a(Objects.requireNonNullElseGet(this.f, fkc::new), this.a, $$1, this.c, false, new fvi(this.h));
      }
   }

   @Override
   public void a(yx $$0) {
      this.b.a($$0.b());
   }

   protected void f() {
      Iterator<fun.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         fun.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(yp<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(wi $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      j.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fjx b(wi $$0) {
      fjx $$1 = Objects.requireNonNullElseGet(this.f, () -> new fmu(new fkc()));
      return (fjx)(this.c != null && this.c.e() ? new grq($$1, i, $$0) : new fiy($$1, i, $$0));
   }

   @Nullable
   public String g() {
      return this.d;
   }

   private void a(yp<? extends vu> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new fun.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   private fjx a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable wi $$4) {
      fjx $$5 = this.a.y;
      return $$5 instanceof fun.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fun.b(this.a, $$5, List.of(new fun.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(yp<? extends vu> a, BooleanSupplier b, long c) {
   }

   class b extends fip {
      private final List<fun.b.a> o;
      @Nullable
      private final fjx p;

      b(fby $$0, @Nullable fjx $$1, List<fun.b.a> $$2, boolean $$3, @Nullable wi $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               goh $$6 = $$0.ae();
               if ($$5) {
                  if (fun.this.c != null) {
                     fun.this.c.a(fve.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fun.this.b.a(wi.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fun.this.c != null) {
                     fun.this.c.a(fve.a.b);
                  }
               }

               for (fun.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fun.this.c != null) {
                  fvf.b(fun.this.c);
               }
            },
            $$3 ? wi.c("multiplayer.requiredTexturePrompt.line1") : wi.c("multiplayer.texturePrompt.line1"),
            fun.a($$3 ? wi.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : wi.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wh.i : wh.f,
            $$3 ? wh.p : wh.g
         );
         this.o = $$2;
         this.p = $$1;
      }

      public fun.b a(fby $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable wi $$5) {
         List<fun.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.o.size() + 1).addAll(this.o).add(new fun.b.a($$1, $$2, $$3)).build();
         return fun.this.new b($$0, this.p, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
