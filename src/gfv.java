import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class gfv implements zb {
   private static final wo k = wo.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final flj a;
   protected final vi b;
   @Nullable
   protected final ggn c;
   @Nullable
   protected String d;
   protected final hkb e;
   @Nullable
   protected final fuk f;
   protected boolean g;
   private final List<gfv.a> m = new ArrayList<>();
   protected final Map<aku, byte[]> h;
   protected Map<String, String> i;
   protected alm j;

   protected gfv(flj $$0, vi $$1, ggd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
      this.i = $$2.j();
      this.j = $$2.k();
   }

   @Override
   public void a(yv $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      zb.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(alm.b.a).map(alm.a::c);
      this.b.a(new vk(wo.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public vk a(wo $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(alm.b.a).map(alm.a::c);
      return new vk($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable yv $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      yy.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + af.f() + "-client.txt");
      Optional<alm.a> $$5 = this.j.a(alm.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(yv<?> $$0) {
      return zb.super.a($$0) ? true : this.g && ($$0 instanceof zk || $$0 instanceof zl);
   }

   @Override
   public void a(zf $$0) {
      this.a(new zr($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zg $$0) {
      yy.a($$0, this, this.a);
      this.b(new zs($$0.b()));
   }

   @Override
   public void a(zc $$0) {
      zy $$1 = $$0.b();
      if (!($$1 instanceof zz)) {
         yy.a($$0, this, this.a);
         if ($$1 instanceof zw $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(zy var1);

   @Override
   public void a(zi $$0) {
      yy.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new zt($$1, zt.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         ggn.a $$5 = this.c != null ? this.c.b() : ggn.a.c;
         if ($$5 != ggn.a.c && (!$$4 || $$5 != ggn.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zh $$0) {
      yy.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static wo a(wo $$0, @Nullable wo $$1) {
      return (wo)($$1 == null ? $$0 : wo.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(abf $$0) {
      yy.a($$0, this, this.a);
      this.b.a(new abi($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(zk $$0) {
      yy.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zd $$0) {
      yy.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(zj $$0) {
      yy.a($$0, this, this.a);
      List<alm.c> $$1 = $$0.b();
      Builder<alm.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (alm.c $$3 : $$1) {
         try {
            URI $$4 = af.a($$3.b());
            $$2.add(new alm.a($$3.a(), $$4));
         } catch (Exception var7) {
            l.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.j = new alm($$2.build());
   }

   @Override
   public void a(zl $$0) {
      this.g = true;
      yy.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(wo.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         ghq $$1 = new ghq($$0.b(), $$0.e());
         ftj.a(Objects.requireNonNullElseGet(this.f, fum::new), this.a, $$1, this.c, false, new ggr(this.h));
      }
   }

   @Override
   public void a(ze $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gfv.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         gfv.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= af.c()) {
            $$0.remove();
         }
      }
   }

   public void b(yv<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vk $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      l.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Is Local", () -> String.valueOf(this.b.e()));
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.i.isEmpty()) {
         p $$2 = $$0.a("Custom Server Details");
         this.i.forEach($$2::a);
      }
   }

   protected fuk b(vk $$0) {
      fuk $$1 = Objects.requireNonNullElseGet(this.f, () -> new fxa(new fum()));
      return (fuk)(this.c != null && this.c.e() ? new hku($$1, k, $$0.a()) : new ftr($$1, k, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(yv<? extends wa> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new gfv.a($$0, $$1, af.c() + $$2.toMillis()));
      }
   }

   private fuk a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable wo $$4) {
      fuk $$5 = this.a.z;
      return $$5 instanceof gfv.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gfv.b(this.a, $$5, List.of(new gfv.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(yv<? extends wa> a, BooleanSupplier b, long c) {
   }

   class b extends fti {
      private final List<gfv.b.a> s;
      @Nullable
      private final fuk u;

      b(final flj $$0, @Nullable final fuk $$1, final List<gfv.b.a> $$2, final boolean $$3, @Nullable final wo $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hhk $$6 = $$0.af();
               if ($$5) {
                  if (gfv.this.c != null) {
                     gfv.this.c.a(ggn.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gfv.this.b.a(wo.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gfv.this.c != null) {
                     gfv.this.c.a(ggn.a.b);
                  }
               }

               for (gfv.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gfv.this.c != null) {
                  ggo.b(gfv.this.c);
               }
            },
            $$3 ? wo.c("multiplayer.requiredTexturePrompt.line1") : wo.c("multiplayer.texturePrompt.line1"),
            gfv.a($$3 ? wo.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : wo.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wn.i : wn.f,
            $$3 ? wn.p : wn.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gfv.b a(flj $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable wo $$5) {
         List<gfv.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gfv.b.a($$1, $$2, $$3)).build();
         return gfv.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
