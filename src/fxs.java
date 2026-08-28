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

public abstract class fxs implements aac {
   private static final xp i = xp.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final fff a;
   protected final wk b;
   @Nullable
   protected final fyj c;
   @Nullable
   protected String d;
   protected final gui e;
   @Nullable
   protected final fnd f;
   protected boolean g;
   private final List<fxs.a> k = new ArrayList<>();
   protected final Map<alf, byte[]> h;

   protected fxs(fff $$0, wk $$1, fxz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
   }

   @Override
   public void a(zw $$0, Exception $$1) {
      j.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      aac.super.a($$0, $$1);
      this.b.a(xp.c("disconnect.packetError"));
   }

   @Override
   public boolean a(zw<?> $$0) {
      return aac.super.a($$0) ? true : this.g && ($$0 instanceof aaj || $$0 instanceof aak);
   }

   @Override
   public void a(aaf $$0) {
      this.a(new aaq($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(aag $$0) {
      zz.a($$0, this, this.a);
      this.b(new aar($$0.b()));
   }

   @Override
   public void a(aad $$0) {
      aax $$1 = $$0.b();
      if (!($$1 instanceof aay)) {
         zz.a($$0, this, this.a);
         if ($$1 instanceof aav $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aax var1);

   @Override
   public void a(aai $$0) {
      zz.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aas($$1, aas.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fyj.a $$5 = this.c != null ? this.c.b() : fyj.a.c;
         if ($$5 != fyj.a.c && (!$$4 || $$5 != fyj.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(aah $$0) {
      zz.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static xp a(xp $$0, @Nullable xp $$1) {
      return (xp)($$1 == null ? $$0 : xp.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(acd $$0) {
      zz.a($$0, this, this.a);
      this.b.a(new acg($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(aaj $$0) {
      zz.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(aak $$0) {
      this.g = true;
      zz.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xp.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         fzm $$1 = new fzm($$0.b(), $$0.e());
         flw.a(Objects.requireNonNullElseGet(this.f, fni::new), this.a, $$1, this.c, false, new fyn(this.h));
      }
   }

   @Override
   public void a(aae $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<fxs.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         fxs.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zw<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(xp $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      j.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fnd b(xp $$0) {
      fnd $$1 = Objects.requireNonNullElseGet(this.f, () -> new fqb(new fni()));
      return (fnd)(this.c != null && this.c.e() ? new gvc($$1, i, $$0) : new fme($$1, i, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zw<? extends xb> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new fxs.a($$0, $$1, ac.c() + $$2.toMillis()));
      }
   }

   private fnd a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xp $$4) {
      fnd $$5 = this.a.y;
      return $$5 instanceof fxs.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fxs.b(this.a, $$5, List.of(new fxs.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zw<? extends xb> a, BooleanSupplier b, long c) {
   }

   class b extends flv {
      private final List<fxs.b.a> r;
      @Nullable
      private final fnd s;

      b(final fff $$0, @Nullable final fnd $$1, final List<fxs.b.a> $$2, final boolean $$3, @Nullable final xp $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               grp $$6 = $$0.ae();
               if ($$5) {
                  if (fxs.this.c != null) {
                     fxs.this.c.a(fyj.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fxs.this.b.a(xp.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fxs.this.c != null) {
                     fxs.this.c.a(fyj.a.b);
                  }
               }

               for (fxs.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fxs.this.c != null) {
                  fyk.b(fxs.this.c);
               }
            },
            $$3 ? xp.c("multiplayer.requiredTexturePrompt.line1") : xp.c("multiplayer.texturePrompt.line1"),
            fxs.a($$3 ? xp.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xp.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xo.i : xo.f,
            $$3 ? xo.p : xo.g
         );
         this.r = $$2;
         this.s = $$1;
      }

      public fxs.b a(fff $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xp $$5) {
         List<fxs.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.r.size() + 1).addAll(this.r).add(new fxs.b.a($$1, $$2, $$3)).build();
         return fxs.this.new b($$0, this.s, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
