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

public abstract class gbu implements zu {
   private static final xh l = xh.c("disconnect.lost");
   private static final Logger m = LogUtils.getLogger();
   protected final fja a;
   protected final wb b;
   @Nullable
   protected final gcl c;
   @Nullable
   protected String d;
   protected final hdh e;
   @Nullable
   protected final fqs f;
   protected boolean g;
   @Deprecated(
      forRemoval = true
   )
   protected final boolean h;
   private final List<gbu.a> n = new ArrayList<>();
   protected final Map<alh, byte[]> i;
   protected Map<String, String> j;
   protected alz k;

   protected gbu(fja $$0, wb $$1, gcb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.i = $$2.h();
      this.h = $$2.j();
      this.j = $$2.k();
      this.k = $$2.l();
   }

   @Override
   public void a(zo $$0, Exception $$1) {
      m.error("Failed to handle packet {}", $$0, $$1);
      zu.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.k.a(alz.b.a).map(alz.a::c);
      if (this.h) {
         this.b.a(new wd(xh.c("disconnect.packetError"), $$2, $$3));
      }
   }

   @Override
   public wd a(xh $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.k.a(alz.b.a).map(alz.a::c);
      return new wd($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zo $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      zr.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ad.f() + "-client.txt");
      Optional<alz.a> $$5 = this.k.a(alz.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zo<?> $$0) {
      return zu.super.a($$0) ? true : this.g && ($$0 instanceof aad || $$0 instanceof aae);
   }

   @Override
   public void a(zy $$0) {
      this.a(new aak($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zz $$0) {
      zr.a($$0, this, this.a);
      this.b(new aal($$0.b()));
   }

   @Override
   public void a(zv $$0) {
      aar $$1 = $$0.b();
      if (!($$1 instanceof aas)) {
         zr.a($$0, this, this.a);
         if ($$1 instanceof aap $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aar var1);

   @Override
   public void a(aab $$0) {
      zr.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aam($$1, aam.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gcl.a $$5 = this.c != null ? this.c.b() : gcl.a.c;
         if ($$5 != gcl.a.c && (!$$4 || $$5 != gcl.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(aaa $$0) {
      zr.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static xh a(xh $$0, @Nullable xh $$1) {
      return (xh)($$1 == null ? $$0 : xh.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(aby $$0) {
      zr.a($$0, this, this.a);
      this.b.a(new acb($$0.b(), this.i.get($$0.b())));
   }

   @Override
   public void a(aad $$0) {
      zr.a($$0, this, this.a);
      this.i.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zw $$0) {
      zr.a($$0, this, this.a);
      this.j = $$0.b();
   }

   @Override
   public void a(aac $$0) {
      zr.a($$0, this, this.a);
      List<alz.c> $$1 = $$0.b();
      Builder<alz.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (alz.c $$3 : $$1) {
         try {
            URI $$4 = ad.a($$3.b());
            $$2.add(new alz.a($$3.a(), $$4));
         } catch (Exception var7) {
            m.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.k = new alz($$2.build());
   }

   @Override
   public void a(aae $$0) {
      this.g = true;
      zr.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xh.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gdo $$1 = new gdo($$0.b(), $$0.e());
         fpr.a(Objects.requireNonNullElseGet(this.f, fqu::new), this.a, $$1, this.c, false, new gcp(this.i));
      }
   }

   @Override
   public void a(zx $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gbu.a> $$0 = this.n.iterator();

      while ($$0.hasNext()) {
         gbu.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ad.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zo<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(wd $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      m.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.j.isEmpty()) {
         p $$2 = $$0.a("Custom Server Details");
         this.j.forEach($$2::a);
      }
   }

   protected fqs b(wd $$0) {
      fqs $$1 = Objects.requireNonNullElseGet(this.f, () -> new fth(new fqu()));
      return (fqs)(this.c != null && this.c.e() ? new hea($$1, l, $$0.a()) : new fpz($$1, l, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zo<? extends wt> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.n.add(new gbu.a($$0, $$1, ad.c() + $$2.toMillis()));
      }
   }

   private fqs a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xh $$4) {
      fqs $$5 = this.a.z;
      return $$5 instanceof gbu.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gbu.b(this.a, $$5, List.of(new gbu.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zo<? extends wt> a, BooleanSupplier b, long c) {
   }

   class b extends fpq {
      private final List<gbu.b.a> s;
      @Nullable
      private final fqs u;

      b(final fja $$0, @Nullable final fqs $$1, final List<gbu.b.a> $$2, final boolean $$3, @Nullable final xh $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               har $$6 = $$0.af();
               if ($$5) {
                  if (gbu.this.c != null) {
                     gbu.this.c.a(gcl.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gbu.this.b.a(xh.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gbu.this.c != null) {
                     gbu.this.c.a(gcl.a.b);
                  }
               }

               for (gbu.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gbu.this.c != null) {
                  gcm.b(gbu.this.c);
               }
            },
            $$3 ? xh.c("multiplayer.requiredTexturePrompt.line1") : xh.c("multiplayer.texturePrompt.line1"),
            gbu.a($$3 ? xh.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xh.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xg.i : xg.f,
            $$3 ? xg.p : xg.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gbu.b a(fja $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xh $$5) {
         List<gbu.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gbu.b.a($$1, $$2, $$3)).build();
         return gbu.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
