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

public abstract class fxn implements zy {
   private static final xl i = xl.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final ffa a;
   protected final wj b;
   @Nullable
   protected final fye c;
   @Nullable
   protected String d;
   protected final gud e;
   @Nullable
   protected final fmy f;
   protected boolean g;
   private final List<fxn.a> k = new ArrayList<>();
   protected final Map<alb, byte[]> h;

   protected fxn(ffa $$0, wj $$1, fxu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
   }

   @Override
   public void a(aab $$0) {
      this.a(new aam($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(aac $$0) {
      zv.a($$0, this, this.a);
      this.b(new aan($$0.b()));
   }

   @Override
   public void a(zz $$0) {
      aat $$1 = $$0.b();
      if (!($$1 instanceof aau)) {
         zv.a($$0, this, this.a);
         if ($$1 instanceof aar $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aat var1);

   @Override
   public void a(aae $$0) {
      zv.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aao($$1, aao.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fye.a $$5 = this.c != null ? this.c.b() : fye.a.c;
         if ($$5 != fye.a.c && (!$$4 || $$5 != fye.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(aad $$0) {
      zv.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static xl a(xl $$0, @Nullable xl $$1) {
      return (xl)($$1 == null ? $$0 : xl.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(abz $$0) {
      zv.a($$0, this, this.a);
      this.b.a(new acc($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(aaf $$0) {
      zv.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(aag $$0) {
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.g = true;
         this.b.a(xl.c("disconnect.transfer"));
         this.a.c(() -> {
            this.b.m();
            this.b.n();
            fzh $$1 = new fzh($$0.b(), $$0.e());
            flr.a(Objects.requireNonNullElseGet(this.f, fnd::new), this.a, $$1, this.c, false, new fyi(this.h));
         });
      }
   }

   @Override
   public void a(aaa $$0) {
      this.b.a($$0.b());
   }

   protected void f() {
      Iterator<fxn.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         fxn.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zs<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(xl $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      j.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fmy b(xl $$0) {
      fmy $$1 = Objects.requireNonNullElseGet(this.f, () -> new fpw(new fnd()));
      return (fmy)(this.c != null && this.c.e() ? new gux($$1, i, $$0) : new flz($$1, i, $$0));
   }

   @Nullable
   public String g() {
      return this.d;
   }

   private void a(zs<? extends wx> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new fxn.a($$0, $$1, ac.c() + $$2.toMillis()));
      }
   }

   private fmy a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xl $$4) {
      fmy $$5 = this.a.y;
      return $$5 instanceof fxn.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fxn.b(this.a, $$5, List.of(new fxn.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zs<? extends wx> a, BooleanSupplier b, long c) {
   }

   class b extends flq {
      private final List<fxn.b.a> r;
      @Nullable
      private final fmy s;

      b(final ffa $$0, @Nullable final fmy $$1, final List<fxn.b.a> $$2, final boolean $$3, @Nullable final xl $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               grk $$6 = $$0.ae();
               if ($$5) {
                  if (fxn.this.c != null) {
                     fxn.this.c.a(fye.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fxn.this.b.a(xl.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fxn.this.c != null) {
                     fxn.this.c.a(fye.a.b);
                  }
               }

               for (fxn.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fxn.this.c != null) {
                  fyf.b(fxn.this.c);
               }
            },
            $$3 ? xl.c("multiplayer.requiredTexturePrompt.line1") : xl.c("multiplayer.texturePrompt.line1"),
            fxn.a($$3 ? xl.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xl.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xk.i : xk.f,
            $$3 ? xk.p : xk.g
         );
         this.r = $$2;
         this.s = $$1;
      }

      public fxn.b a(ffa $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xl $$5) {
         List<fxn.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.r.size() + 1).addAll(this.r).add(new fxn.b.a($$1, $$2, $$3)).build();
         return fxn.this.new b($$0, this.s, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
