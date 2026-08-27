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

public abstract class fwo implements zk {
   private static final wx i = wx.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final feb a;
   protected final vv b;
   @Nullable
   protected final fxf c;
   @Nullable
   protected String d;
   protected final gta e;
   @Nullable
   protected final flz f;
   protected boolean g;
   private final List<fwo.a> k = new ArrayList<>();
   protected final Map<akn, byte[]> h;

   protected fwo(feb $$0, vv $$1, fwv $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
   }

   @Override
   public void a(zn $$0) {
      this.a(new zy($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zo $$0) {
      zh.a($$0, this, this.a);
      this.b(new zz($$0.b()));
   }

   @Override
   public void a(zl $$0) {
      aaf $$1 = $$0.b();
      if (!($$1 instanceof aag)) {
         zh.a($$0, this, this.a);
         if ($$1 instanceof aad $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aaf var1);

   @Override
   public void a(zq $$0) {
      zh.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aaa($$1, aaa.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fxf.a $$5 = this.c != null ? this.c.b() : fxf.a.c;
         if ($$5 != fxf.a.c && (!$$4 || $$5 != fxf.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zp $$0) {
      zh.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static wx a(wx $$0, @Nullable wx $$1) {
      return (wx)($$1 == null ? $$0 : wx.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(abl $$0) {
      zh.a($$0, this, this.a);
      this.b.a(new abo($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(zr $$0) {
      zh.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zs $$0) {
      zh.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.g = true;
         this.b.a(wx.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         fyi $$1 = new fyi($$0.b(), $$0.e());
         fks.a(Objects.requireNonNullElseGet(this.f, fme::new), this.a, $$1, this.c, false, new fxj(this.h));
      }
   }

   @Override
   public void a(zm $$0) {
      this.b.a($$0.b());
   }

   protected void f() {
      Iterator<fwo.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         fwo.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.c()) {
            $$0.remove();
         }
      }
   }

   public void b(ze<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(wx $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      j.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected flz b(wx $$0) {
      flz $$1 = Objects.requireNonNullElseGet(this.f, () -> new fox(new fme()));
      return (flz)(this.c != null && this.c.e() ? new gtu($$1, i, $$0) : new fla($$1, i, $$0));
   }

   @Nullable
   public String g() {
      return this.d;
   }

   private void a(ze<? extends wj> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new fwo.a($$0, $$1, ac.c() + $$2.toMillis()));
      }
   }

   private flz a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable wx $$4) {
      flz $$5 = this.a.y;
      return $$5 instanceof fwo.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fwo.b(this.a, $$5, List.of(new fwo.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(ze<? extends wj> a, BooleanSupplier b, long c) {
   }

   class b extends fkr {
      private final List<fwo.b.a> r;
      @Nullable
      private final flz s;

      b(feb $$0, @Nullable flz $$1, List<fwo.b.a> $$2, boolean $$3, @Nullable wx $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               gql $$6 = $$0.ae();
               if ($$5) {
                  if (fwo.this.c != null) {
                     fwo.this.c.a(fxf.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fwo.this.b.a(wx.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fwo.this.c != null) {
                     fwo.this.c.a(fxf.a.b);
                  }
               }

               for (fwo.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fwo.this.c != null) {
                  fxg.b(fwo.this.c);
               }
            },
            $$3 ? wx.c("multiplayer.requiredTexturePrompt.line1") : wx.c("multiplayer.texturePrompt.line1"),
            fwo.a($$3 ? wx.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : wx.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? ww.i : ww.f,
            $$3 ? ww.p : ww.g
         );
         this.r = $$2;
         this.s = $$1;
      }

      public fwo.b a(feb $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable wx $$5) {
         List<fwo.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.r.size() + 1).addAll(this.r).add(new fwo.b.a($$1, $$2, $$3)).build();
         return fwo.this.new b($$0, this.s, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
