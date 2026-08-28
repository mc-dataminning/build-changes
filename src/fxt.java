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

public abstract class fxt implements aac {
   private static final xp j = xp.c("disconnect.lost");
   private static final Logger k = LogUtils.getLogger();
   protected final ffg a;
   protected final wk b;
   @Nullable
   protected final fyk c;
   @Nullable
   protected String d;
   protected final guj e;
   @Nullable
   protected final fne f;
   protected boolean g;
   @Deprecated(
      forRemoval = true
   )
   protected final boolean h;
   private final List<fxt.a> l = new ArrayList<>();
   protected final Map<alf, byte[]> i;

   protected fxt(ffg $$0, wk $$1, fya $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.i = $$2.h();
      this.h = $$2.j();
   }

   @Override
   public void a(zw $$0, Exception $$1) {
      k.error("Failed to handle packet {}", $$0, $$1);
      if (this.h) {
         this.b.a(xp.c("disconnect.packetError"));
      }
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
         fyk.a $$5 = this.c != null ? this.c.b() : fyk.a.c;
         if ($$5 != fyk.a.c && (!$$4 || $$5 != fyk.a.b)) {
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
      this.b.a(new acg($$0.b(), this.i.get($$0.b())));
   }

   @Override
   public void a(aaj $$0) {
      zz.a($$0, this, this.a);
      this.i.put($$0.b(), $$0.e());
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
         fzn $$1 = new fzn($$0.b(), $$0.e());
         flx.a(Objects.requireNonNullElseGet(this.f, fnj::new), this.a, $$1, this.c, false, new fyo(this.i));
      }
   }

   @Override
   public void a(aae $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<fxt.a> $$0 = this.l.iterator();

      while ($$0.hasNext()) {
         fxt.a $$1 = $$0.next();
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
      k.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fne b(xp $$0) {
      fne $$1 = Objects.requireNonNullElseGet(this.f, () -> new fqc(new fnj()));
      return (fne)(this.c != null && this.c.e() ? new gvd($$1, j, $$0) : new fmf($$1, j, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zw<? extends xb> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.l.add(new fxt.a($$0, $$1, ac.c() + $$2.toMillis()));
      }
   }

   private fne a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xp $$4) {
      fne $$5 = this.a.y;
      return $$5 instanceof fxt.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fxt.b(this.a, $$5, List.of(new fxt.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zw<? extends xb> a, BooleanSupplier b, long c) {
   }

   class b extends flw {
      private final List<fxt.b.a> r;
      @Nullable
      private final fne s;

      b(final ffg $$0, @Nullable final fne $$1, final List<fxt.b.a> $$2, final boolean $$3, @Nullable final xp $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               grq $$6 = $$0.ae();
               if ($$5) {
                  if (fxt.this.c != null) {
                     fxt.this.c.a(fyk.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fxt.this.b.a(xp.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fxt.this.c != null) {
                     fxt.this.c.a(fyk.a.b);
                  }
               }

               for (fxt.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fxt.this.c != null) {
                  fyl.b(fxt.this.c);
               }
            },
            $$3 ? xp.c("multiplayer.requiredTexturePrompt.line1") : xp.c("multiplayer.texturePrompt.line1"),
            fxt.a($$3 ? xp.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xp.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xo.i : xo.f,
            $$3 ? xo.p : xo.g
         );
         this.r = $$2;
         this.s = $$1;
      }

      public fxt.b a(ffg $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xp $$5) {
         List<fxt.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.r.size() + 1).addAll(this.r).add(new fxt.b.a($$1, $$2, $$3)).build();
         return fxt.this.new b($$0, this.s, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
