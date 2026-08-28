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

public abstract class ggv implements zc {
   private static final wp k = wp.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final fmg a;
   protected final vi b;
   @Nullable
   protected final ghn c;
   @Nullable
   protected String d;
   protected final hlh e;
   @Nullable
   protected final fvi f;
   protected boolean g;
   private final List<ggv.a> m = new ArrayList<>();
   protected final Map<aku, byte[]> h;
   protected Map<String, String> i;
   protected alm j;

   protected ggv(fmg $$0, vi $$1, ghd $$2) {
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
   public void a(yw $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      zc.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(alm.b.a).map(alm.a::c);
      this.b.a(new vk(wp.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public vk a(wp $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(alm.b.a).map(alm.a::c);
      return new vk($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable yw $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      yz.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + af.f() + "-client.txt");
      Optional<alm.a> $$5 = this.j.a(alm.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(yw<?> $$0) {
      return zc.super.a($$0) ? true : this.g && ($$0 instanceof zl || $$0 instanceof zm);
   }

   @Override
   public void a(zg $$0) {
      this.a(new zs($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zh $$0) {
      yz.a($$0, this, this.a);
      this.b(new zt($$0.b()));
   }

   @Override
   public void a(zd $$0) {
      zz $$1 = $$0.b();
      if (!($$1 instanceof aaa)) {
         yz.a($$0, this, this.a);
         if ($$1 instanceof zx $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(zz var1);

   @Override
   public void a(zj $$0) {
      yz.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new zu($$1, zu.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         ghn.a $$5 = this.c != null ? this.c.b() : ghn.a.c;
         if ($$5 != ghn.a.c && (!$$4 || $$5 != ghn.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zi $$0) {
      yz.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static wp a(wp $$0, @Nullable wp $$1) {
      return (wp)($$1 == null ? $$0 : wp.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(abg $$0) {
      yz.a($$0, this, this.a);
      this.b.a(new abj($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(zl $$0) {
      yz.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(ze $$0) {
      yz.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(zk $$0) {
      yz.a($$0, this, this.a);
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
   public void a(zm $$0) {
      this.g = true;
      yz.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(wp.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         giq $$1 = new giq($$0.b(), $$0.e());
         fuh.a(Objects.requireNonNullElseGet(this.f, fvk::new), this.a, $$1, this.c, false, new ghr(this.h));
      }
   }

   @Override
   public void a(zf $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<ggv.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         ggv.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= af.c()) {
            $$0.remove();
         }
      }
   }

   public void b(yw<?> $$0) {
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

   protected fvi b(vk $$0) {
      fvi $$1 = Objects.requireNonNullElseGet(this.f, () -> new fxy(new fvk()));
      return (fvi)(this.c != null && this.c.e() ? new hma($$1, k, $$0.a()) : new fup($$1, k, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(yw<? extends wb> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new ggv.a($$0, $$1, af.c() + $$2.toMillis()));
      }
   }

   private fvi a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable wp $$4) {
      fvi $$5 = this.a.z;
      return $$5 instanceof ggv.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new ggv.b(this.a, $$5, List.of(new ggv.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(yw<? extends wb> a, BooleanSupplier b, long c) {
   }

   class b extends fug {
      private final List<ggv.b.a> s;
      @Nullable
      private final fvi u;

      b(final fmg $$0, @Nullable final fvi $$1, final List<ggv.b.a> $$2, final boolean $$3, @Nullable final wp $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hiq $$6 = $$0.af();
               if ($$5) {
                  if (ggv.this.c != null) {
                     ggv.this.c.a(ghn.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     ggv.this.b.a(wp.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (ggv.this.c != null) {
                     ggv.this.c.a(ghn.a.b);
                  }
               }

               for (ggv.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (ggv.this.c != null) {
                  gho.b(ggv.this.c);
               }
            },
            $$3 ? wp.c("multiplayer.requiredTexturePrompt.line1") : wp.c("multiplayer.texturePrompt.line1"),
            ggv.a($$3 ? wp.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : wp.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wo.i : wo.f,
            $$3 ? wo.p : wo.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public ggv.b a(fmg $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable wp $$5) {
         List<ggv.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new ggv.b.a($$1, $$2, $$3)).build();
         return ggv.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
