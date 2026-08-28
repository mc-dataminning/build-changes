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

public abstract class gll implements zw {
   private static final xg k = xg.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final fqq a;
   protected final vv b;
   @Nullable
   protected final gmd c;
   @Nullable
   protected String d;
   protected final hqg e;
   @Nullable
   protected final fzq f;
   protected boolean g;
   private final List<gll.a> m = new ArrayList<>();
   protected final Map<alr, byte[]> h;
   protected Map<String, String> i;
   protected amj j;

   protected gll(fqq $$0, vv $$1, glt $$2) {
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
   public void a(zo $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(amj.b.a).map(amj.a::c);
      this.b.a(new vx(xg.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public vx a(xg $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(amj.b.a).map(amj.a::c);
      return new vx($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zo $$0, Throwable $$1) {
      p $$2 = p.a($$1, "Packet handling error");
      zr.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ag.f() + "-client.txt");
      Optional<amj.a> $$5 = this.j.a(amj.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, z.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zo<?> $$0) {
      return zw.super.a($$0) ? true : this.g && ($$0 instanceof aaf || $$0 instanceof aag);
   }

   @Override
   public void a(aaa $$0) {
      this.a(new aam($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(aab $$0) {
      zr.a($$0, this, this.a);
      this.b(new aan($$0.b()));
   }

   @Override
   public void a(zx $$0) {
      aat $$1 = $$0.b();
      if (!($$1 instanceof aau)) {
         zr.a($$0, this, this.a);
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
   public void a(aad $$0) {
      zr.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aao($$1, aao.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gmd.a $$5 = this.c != null ? this.c.b() : gmd.a.c;
         if ($$5 != gmd.a.c && (!$$4 || $$5 != gmd.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(aac $$0) {
      zr.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static xg a(xg $$0, @Nullable xg $$1) {
      return (xg)($$1 == null ? $$0 : xg.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(aca $$0) {
      zr.a($$0, this, this.a);
      this.b.a(new acd($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(aaf $$0) {
      zr.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zy $$0) {
      zr.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(aae $$0) {
      zr.a($$0, this, this.a);
      List<amj.c> $$1 = $$0.b();
      Builder<amj.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (amj.c $$3 : $$1) {
         try {
            URI $$4 = ag.a($$3.b());
            $$2.add(new amj.a($$3.a(), $$4));
         } catch (Exception var7) {
            l.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.j = new amj($$2.build());
   }

   @Override
   public void a(aag $$0) {
      this.g = true;
      zr.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xg.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gng $$1 = new gng($$0.b(), $$0.e());
         fyp.a(Objects.requireNonNullElseGet(this.f, fzs::new), this.a, $$1, this.c, false, new gmh(this.h));
      }
   }

   @Override
   public void a(zz $$0) {
      this.b.a($$0.b());
   }

   protected void a() {
      Iterator<gll.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         gll.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ag.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zo<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vx $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      l.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(p $$0, q $$1) {
      $$1.a("Is Local", () -> String.valueOf(this.b.e()));
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.i.isEmpty()) {
         q $$2 = $$0.a("Custom Server Details");
         this.i.forEach($$2::a);
      }
   }

   protected fzq b(vx $$0) {
      fzq $$1 = Objects.requireNonNullElseGet(this.f, () -> new gci(new fzs()));
      return (fzq)(this.c != null && this.c.e() ? new hqz($$1, k, $$0.a()) : new fyx($$1, k, $$0));
   }

   @Nullable
   @Override
   public String e() {
      return this.d;
   }

   private void a(zo<? extends wq> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new gll.a($$0, $$1, ag.c() + $$2.toMillis()));
      }
   }

   private fzq a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xg $$4) {
      fzq $$5 = this.a.z;
      return $$5 instanceof gll.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gll.b(this.a, $$5, List.of(new gll.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zo<? extends wq> a, BooleanSupplier b, long c) {
   }

   class b extends fyo {
      private final List<gll.b.a> s;
      @Nullable
      private final fzq u;

      b(final fqq $$0, @Nullable final fzq $$1, final List<gll.b.a> $$2, final boolean $$3, @Nullable final xg $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hnp $$6 = $$0.af();
               if ($$5) {
                  if (gll.this.c != null) {
                     gll.this.c.a(gmd.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gll.this.b.a(xg.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gll.this.c != null) {
                     gll.this.c.a(gmd.a.b);
                  }
               }

               for (gll.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gll.this.c != null) {
                  gme.b(gll.this.c);
               }
            },
            $$3 ? xg.c("multiplayer.requiredTexturePrompt.line1") : xg.c("multiplayer.texturePrompt.line1"),
            gll.a($$3 ? xg.c("multiplayer.requiredTexturePrompt.line2").a(o.o, o.r) : xg.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xf.i : xf.f,
            $$3 ? xf.p : xf.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gll.b a(fqq $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xg $$5) {
         List<gll.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gll.b.a($$1, $$2, $$3)).build();
         return gll.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
