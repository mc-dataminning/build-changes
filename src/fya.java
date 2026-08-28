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

public abstract class fya implements zh {
   private static final wu j = wu.c("disconnect.lost");
   private static final Logger k = LogUtils.getLogger();
   protected final ffn a;
   protected final vp b;
   @Nullable
   protected final fyr c;
   @Nullable
   protected String d;
   protected final guo e;
   @Nullable
   protected final fnd f;
   protected boolean g;
   @Deprecated(
      forRemoval = true
   )
   protected final boolean h;
   private final List<fya.a> l = new ArrayList<>();
   protected final Map<akk, byte[]> i;

   protected fya(ffn $$0, vp $$1, fyh $$2) {
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
   public void a(zb $$0, Exception $$1) {
      k.error("Failed to handle packet {}", $$0, $$1);
      zh.super.a($$0, $$1);
      if (this.h) {
         this.b.a(wu.c("disconnect.packetError"));
      }
   }

   @Override
   public boolean a(zb<?> $$0) {
      return zh.super.a($$0) ? true : this.g && ($$0 instanceof zo || $$0 instanceof zp);
   }

   @Override
   public void a(zk $$0) {
      this.a(new zv($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zl $$0) {
      ze.a($$0, this, this.a);
      this.b(new zw($$0.b()));
   }

   @Override
   public void a(zi $$0) {
      aac $$1 = $$0.b();
      if (!($$1 instanceof aad)) {
         ze.a($$0, this, this.a);
         if ($$1 instanceof aaa $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aac var1);

   @Override
   public void a(zn $$0) {
      ze.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new zx($$1, zx.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fyr.a $$5 = this.c != null ? this.c.b() : fyr.a.c;
         if ($$5 != fyr.a.c && (!$$4 || $$5 != fyr.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zm $$0) {
      ze.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static wu a(wu $$0, @Nullable wu $$1) {
      return (wu)($$1 == null ? $$0 : wu.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(abi $$0) {
      ze.a($$0, this, this.a);
      this.b.a(new abl($$0.b(), this.i.get($$0.b())));
   }

   @Override
   public void a(zo $$0) {
      ze.a($$0, this, this.a);
      this.i.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zp $$0) {
      this.g = true;
      ze.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(wu.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         fzv $$1 = new fzv($$0.b(), $$0.e());
         fmc.a(Objects.requireNonNullElseGet(this.f, fnf::new), this.a, $$1, this.c, false, new fyw(this.i));
      }
   }

   @Override
   public void a(zj $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<fya.a> $$0 = this.l.iterator();

      while ($$0.hasNext()) {
         fya.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zb<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(wu $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      k.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fnd b(wu $$0) {
      fnd $$1 = Objects.requireNonNullElseGet(this.f, () -> new fps(new fnf()));
      return (fnd)(this.c != null && this.c.e() ? new gvi($$1, j, $$0) : new fmk($$1, j, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zb<? extends wg> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.l.add(new fya.a($$0, $$1, ac.c() + $$2.toMillis()));
      }
   }

   private fnd a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable wu $$4) {
      fnd $$5 = this.a.y;
      return $$5 instanceof fya.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fya.b(this.a, $$5, List.of(new fya.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zb<? extends wg> a, BooleanSupplier b, long c) {
   }

   class b extends fmb {
      private final List<fya.b.a> r;
      @Nullable
      private final fnd s;

      b(final ffn $$0, @Nullable final fnd $$1, final List<fya.b.a> $$2, final boolean $$3, @Nullable final wu $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               gry $$6 = $$0.ae();
               if ($$5) {
                  if (fya.this.c != null) {
                     fya.this.c.a(fyr.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fya.this.b.a(wu.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fya.this.c != null) {
                     fya.this.c.a(fyr.a.b);
                  }
               }

               for (fya.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fya.this.c != null) {
                  fys.b(fya.this.c);
               }
            },
            $$3 ? wu.c("multiplayer.requiredTexturePrompt.line1") : wu.c("multiplayer.texturePrompt.line1"),
            fya.a($$3 ? wu.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : wu.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wt.i : wt.f,
            $$3 ? wt.p : wt.g
         );
         this.r = $$2;
         this.s = $$1;
      }

      public fya.b a(ffn $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable wu $$5) {
         List<fya.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.r.size() + 1).addAll(this.r).add(new fya.b.a($$1, $$2, $$3)).build();
         return fya.this.new b($$0, this.s, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
