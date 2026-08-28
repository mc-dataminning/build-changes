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

public abstract class ghw implements zi {
   private static final wv k = wv.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final fnd a;
   protected final vo b;
   @Nullable
   protected final gio c;
   @Nullable
   protected String d;
   protected final hmi e;
   @Nullable
   protected final fwf f;
   protected boolean g;
   private final List<ghw.a> m = new ArrayList<>();
   protected final Map<ald, byte[]> h;
   protected Map<String, String> i;
   protected alv j;

   protected ghw(fnd $$0, vo $$1, gie $$2) {
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
   public void a(zc $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      zi.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(alv.b.a).map(alv.a::c);
      this.b.a(new vq(wv.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public vq a(wv $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(alv.b.a).map(alv.a::c);
      return new vq($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zc $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      zf.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + af.f() + "-client.txt");
      Optional<alv.a> $$5 = this.j.a(alv.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zc<?> $$0) {
      return zi.super.a($$0) ? true : this.g && ($$0 instanceof zr || $$0 instanceof zs);
   }

   @Override
   public void a(zm $$0) {
      this.a(new zy($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zn $$0) {
      zf.a($$0, this, this.a);
      this.b(new zz($$0.b()));
   }

   @Override
   public void a(zj $$0) {
      aaf $$1 = $$0.b();
      if (!($$1 instanceof aag)) {
         zf.a($$0, this, this.a);
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
   public void a(zp $$0) {
      zf.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aaa($$1, aaa.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gio.a $$5 = this.c != null ? this.c.b() : gio.a.c;
         if ($$5 != gio.a.c && (!$$4 || $$5 != gio.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zo $$0) {
      zf.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static wv a(wv $$0, @Nullable wv $$1) {
      return (wv)($$1 == null ? $$0 : wv.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(abm $$0) {
      zf.a($$0, this, this.a);
      this.b.a(new abp($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(zr $$0) {
      zf.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zk $$0) {
      zf.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(zq $$0) {
      zf.a($$0, this, this.a);
      List<alv.c> $$1 = $$0.b();
      Builder<alv.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (alv.c $$3 : $$1) {
         try {
            URI $$4 = af.a($$3.b());
            $$2.add(new alv.a($$3.a(), $$4));
         } catch (Exception var7) {
            l.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.j = new alv($$2.build());
   }

   @Override
   public void a(zs $$0) {
      this.g = true;
      zf.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(wv.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gjr $$1 = new gjr($$0.b(), $$0.e());
         fve.a(Objects.requireNonNullElseGet(this.f, fwh::new), this.a, $$1, this.c, false, new gis(this.h));
      }
   }

   @Override
   public void a(zl $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<ghw.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         ghw.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= af.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zc<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vq $$0) {
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

   protected fwf b(vq $$0) {
      fwf $$1 = Objects.requireNonNullElseGet(this.f, () -> new fyx(new fwh()));
      return (fwf)(this.c != null && this.c.e() ? new hnb($$1, k, $$0.a()) : new fvm($$1, k, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zc<? extends wh> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new ghw.a($$0, $$1, af.c() + $$2.toMillis()));
      }
   }

   private fwf a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable wv $$4) {
      fwf $$5 = this.a.z;
      return $$5 instanceof ghw.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new ghw.b(this.a, $$5, List.of(new ghw.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zc<? extends wh> a, BooleanSupplier b, long c) {
   }

   class b extends fvd {
      private final List<ghw.b.a> s;
      @Nullable
      private final fwf u;

      b(final fnd $$0, @Nullable final fwf $$1, final List<ghw.b.a> $$2, final boolean $$3, @Nullable final wv $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hjr $$6 = $$0.af();
               if ($$5) {
                  if (ghw.this.c != null) {
                     ghw.this.c.a(gio.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     ghw.this.b.a(wv.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (ghw.this.c != null) {
                     ghw.this.c.a(gio.a.b);
                  }
               }

               for (ghw.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (ghw.this.c != null) {
                  gip.b(ghw.this.c);
               }
            },
            $$3 ? wv.c("multiplayer.requiredTexturePrompt.line1") : wv.c("multiplayer.texturePrompt.line1"),
            ghw.a($$3 ? wv.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : wv.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wu.i : wu.f,
            $$3 ? wu.p : wu.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public ghw.b a(fnd $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable wv $$5) {
         List<ghw.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new ghw.b.a($$1, $$2, $$3)).build();
         return ghw.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
