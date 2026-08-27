package net.minecraft.server;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends bfi<afi> implements afe, dr, AutoCloseable {
   private static final Logger n = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float o = 0.8F;
   private static final int p = 100;
   public static final int c = 50;
   private static final int q = 2000;
   private static final int r = 15000;
   private static final long s = 5000000000L;
   private static final int t = 12;
   public static final int d = 11;
   private static final int u = 441;
   private static final int v = 6000;
   private static final int w = 3;
   public static final int e = 29999984;
   public static final cpo f = new cpo("Demo World", cph.a, false, bgl.c, false, new cpg(), cqd.c);
   private static final long x = 50L;
   public static final GameProfile g = new GameProfile(ac.c, "Anonymous Player");
   protected final ebv.c h;
   protected final eby i;
   private final List<Runnable> y = Lists.newArrayList();
   private beq z = bep.a;
   private bde A = this.z.f();
   private Consumer<bdd> B = $$0x -> this.aP();
   private Consumer<Path> C = $$0x -> {
   };
   private boolean D;
   @Nullable
   private MinecraftServer.c E;
   private boolean F;
   private final alf G;
   private final aks H;
   @Nullable
   private ads I;
   @Nullable
   private ads.a J;
   private final art K = art.a();
   private final DataFixer L;
   private String M;
   private int N = -1;
   private final hm<aey> O;
   private final Map<aeo<cpk>, aki> P = Maps.newLinkedHashMap();
   private anx Q;
   private volatile boolean R = true;
   private boolean S;
   private int T;
   protected final Proxy j;
   private boolean U;
   private boolean V;
   private boolean W;
   private boolean X;
   @Nullable
   private String Y;
   private int Z;
   public final long[] k = new long[100];
   @Nullable
   private KeyPair aa;
   @Nullable
   private GameProfile ab;
   private boolean ac;
   private volatile boolean ad;
   private long ae;
   protected final afh l;
   private long af;
   private final Thread ag;
   private long ah = ac.b();
   private long ai;
   private boolean aj;
   private final amv ak;
   private final afg al = new afg(this);
   @Nullable
   private ebo am;
   private final afo an = new afo();
   private final afd ao;
   private final arc ap = new arc();
   private boolean aq;
   private float ar;
   private final Executor as;
   @Nullable
   private String at;
   private MinecraftServer.a au;
   private final dyr av;
   protected final ecb m;
   private volatile boolean aw;

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference<>();
      Thread $$2 = new Thread(() -> $$1.get().w(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> n.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, ebv.c $$1, amv $$2, afk $$3, Proxy $$4, DataFixer $$5, afh $$6, aks $$7) {
      super("Server");
      this.O = $$3.c();
      this.m = $$3.d();
      if (!this.O.a().d(jd.aI).c(dii.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.j = $$4;
         this.ak = $$2;
         this.au = new MinecraftServer.a($$3.a(), $$3.b());
         this.l = $$6;
         if ($$6.e() != null) {
            $$6.e().a(this);
         }

         this.G = new alf(this);
         this.H = $$7;
         this.h = $$1;
         this.i = $$1.c();
         this.L = $$5;
         this.ao = new afd(this, this.au.b.a());
         hg<csk> $$8 = this.O.a().d(jd.e).p().a(this.m.M());
         this.av = new dyr($$3.a(), $$1, $$5, $$8);
         this.ag = $$0;
         this.as = ac.f();
      }
   }

   private void a(ebr $$0) {
      $$0.a(this.aF().b(), "scoreboard");
   }

   protected abstract boolean e() throws IOException;

   protected void n_() {
      if (!bdk.e.c()) {
      }

      boolean $$0 = false;
      bdn $$1 = bdk.e.e();
      this.m.a(this.getServerModName(), this.K().a());
      akr $$2 = this.H.create(11);
      this.a($$2);
      this.r();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish();
      }

      if ($$0) {
         try {
            bdk.e.b();
         } catch (Throwable var5) {
            n.warn("Failed to stop JFR profiling", var5);
         }
      }
   }

   protected void r() {
   }

   protected void a(akr $$0) {
      eca $$1 = this.m.K();
      boolean $$2 = this.m.C();
      hs<dii> $$3 = this.O.a().d(jd.aI);
      dlf $$4 = this.m.A();
      long $$5 = $$4.b();
      long $$6 = cqk.a($$5);
      List<cox> $$7 = ImmutableList.of(new dkt(), new dks(), new cau(), new btu(), new cbf($$1));
      dii $$8 = $$3.a(dii.b);
      aki $$9 = new aki(this, this.as, this.h, $$1, cpk.h, $$8, $$0, $$2, $$6, $$7, true, null);
      this.P.put(cpk.h, $$9);
      ebr $$10 = $$9.s();
      this.a($$10);
      this.am = new ebo($$10);
      dgp $$11 = $$9.w_();
      if (!$$1.p()) {
         try {
            a($$9, $$1, $$4.d(), $$2);
            $$1.c(true);
            if ($$2) {
               this.a(this.m);
            }
         } catch (Throwable var23) {
            o $$13 = o.a(var23, "Exception initializing level");

            try {
               $$9.a($$13);
            } catch (Throwable var22) {
            }

            throw new y($$13);
         }

         $$1.c(true);
      }

      this.ac().a($$9);
      if (this.m.G() != null) {
         this.aJ().a(this.m.G());
      }

      bgu $$14 = $$9.H();

      for (Entry<aeo<dii>, dii> $$15 : $$3.g()) {
         aeo<dii> $$16 = $$15.getKey();
         if ($$16 != dii.b) {
            aeo<cpk> $$17 = aeo.a(jd.aH, $$16.a());
            ebq $$18 = new ebq(this.m, $$1);
            aki $$19 = new aki(this, this.as, this.h, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, ImmutableList.of(), false, $$14);
            $$11.a(new dgn.a($$19.w_()));
            this.P.put($$17, $$19);
         }
      }

      $$11.a($$1.r());
   }

   private static void a(aki $$0, eca $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(gv.b.b(80), 0.0F);
      } else {
         akg $$4 = $$0.k();
         cor $$5 = new cor($$4.i().b().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.C_()) {
            gv $$7 = $$5.l();
            $$6 = $$0.a(dkh.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;
         int $$12 = 5;

         for (int $$13 = 0; $$13 < aro.h(11); $$13++) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               gv $$14 = akd.a($$0, new cor($$5.e + $$8, $$5.f + $$9));
               if ($$14 != null) {
                  $$1.a($$14, 0.0F);
                  break;
               }
            }

            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
               int $$15 = $$10;
               $$10 = -$$11;
               $$11 = $$15;
            }

            $$8 += $$10;
            $$9 += $$11;
         }

         if ($$2) {
            $$0.B_().c(jd.as).flatMap($$0x -> $$0x.b(oo.m)).ifPresent($$3x -> ((dmy)$$3x.a()).a($$0, $$4.g(), $$0.z, new gv($$1.a(), $$1.b(), $$1.c())));
         }
      }
   }

   private void a(ecb $$0) {
      $$0.a(bgl.a);
      $$0.d(true);
      eca $$1 = $$0.K();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(cph.d);
   }

   private void b(akr $$0) {
      aki $$1 = this.D();
      n.info("Preparing start region for dimension {}", $$1.ac().a());
      gv $$2 = $$1.R();
      $$0.a(new cor($$2));
      akg $$3 = $$1.k();
      this.ah = ac.b();
      $$3.a(akn.a, new cor($$2), 11, asn.a);

      while ($$3.b() != 441) {
         this.ah = ac.b() + 10L;
         this.p_();
      }

      this.ah = ac.b() + 10L;
      this.p_();

      for (aki $$4 : this.P.values()) {
         cpf $$5 = $$4.s().b(cpf.a(), "chunks");
         if ($$5 != null) {
            LongIterator $$6 = $$5.b().iterator();

            while ($$6.hasNext()) {
               long $$7 = $$6.nextLong();
               cor $$8 = new cor($$7);
               $$4.k().a($$8, true);
            }
         }
      }

      this.ah = ac.b() + 10L;
      this.p_();
      $$0.b();
      this.bt();
   }

   public cph o_() {
      return this.m.m();
   }

   public boolean h() {
      return this.m.n();
   }

   public abstract int i();

   public abstract int j();

   public abstract boolean k();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for (aki $$4 : this.F()) {
         if (!$$0) {
            n.info("Saving chunks for level '{}'/{}", $$4, $$4.ac().a());
         }

         $$4.a(null, $$1, $$4.e && !$$2);
         $$3 = true;
      }

      aki $$5 = this.D();
      eca $$6 = this.m.K();
      $$6.a($$5.w_().t());
      this.m.a(this.aJ().c());
      this.h.a(this.aV(), this.m, this.ac().r());
      if ($$1) {
         for (aki $$7 : this.F()) {
            n.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.k().a.n());
         }

         n.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.aw = true;
         this.ac().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.aw = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.t();
   }

   public void t() {
      if (this.z.e()) {
         this.aR();
      }

      n.info("Stopping server");
      this.ad().b();
      this.aw = true;
      if (this.Q != null) {
         n.info("Saving players");
         this.Q.h();
         this.Q.s();
      }

      n.info("Saving worlds");

      for (aki $$0 : this.F()) {
         if ($$0 != null) {
            $$0.e = false;
         }
      }

      while (this.P.values().stream().anyMatch($$0x -> $$0x.k().a.f())) {
         this.ah = ac.b() + 1L;

         for (aki $$1 : this.F()) {
            $$1.k().o();
            $$1.k().a(() -> true, false);
         }

         this.p_();
      }

      this.a(false, true, false);

      for (aki $$2 : this.F()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               n.error("Exception closing the level", var5);
            }
         }
      }

      this.aw = false;
      this.au.close();

      try {
         this.h.close();
      } catch (IOException var4) {
         n.error("Failed to unlock level {}", this.h.b(), var4);
      }
   }

   public String u() {
      return this.M;
   }

   public void a_(String $$0) {
      this.M = $$0;
   }

   public boolean v() {
      return this.R;
   }

   public void a(boolean $$0) {
      this.R = false;
      if ($$0) {
         try {
            this.ag.join();
         } catch (InterruptedException var3) {
            n.error("Error while shutting down", var3);
         }
      }
   }

   protected void w() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.ah = ac.b();
         this.J = this.bi().orElse(null);
         this.I = this.bj();

         while (this.R) {
            long $$0 = ac.b() - this.ah;
            if ($$0 > 2000L && this.ah - this.ae >= 15000L) {
               long $$1 = $$0 / 50L;
               n.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$0, $$1);
               this.ah += $$1 * 50L;
               this.ae = this.ah;
            }

            if (this.F) {
               this.F = false;
               this.E = new MinecraftServer.c(ac.c(), this.T);
            }

            this.ah += 50L;
            this.bu();
            this.A.a("tick");
            this.a(this::bg);
            this.A.b("nextTickWait");
            this.aj = true;
            this.ai = Math.max(ac.b() + 50L, this.ah);
            this.p_();
            this.A.c();
            this.bv();
            this.ad = true;
            bdk.e.a(this.ar);
         }
      } catch (Throwable var44) {
         n.error("Encountered an unexpected exception", var44);
         o $$4 = a(var44);
         this.b($$4.g());
         File $$5 = new File(new File(this.z(), "crash-reports"), "crash-" + ac.e() + "-server.txt");
         if ($$4.a($$5)) {
            n.error("This crash report has been saved to: {}", $$5.getAbsolutePath());
         } else {
            n.error("We were unable to save this crash report to disk.");
         }

         this.a($$4);
      } finally {
         try {
            this.S = true;
            this.t();
         } catch (Throwable var42) {
            n.error("Exception stopping the server", var42);
         } finally {
            if (this.l.e() != null) {
               this.l.e().a();
            }

            this.g();
         }
      }
   }

   private static o a(Throwable $$0) {
      y $$1 = null;

      for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof y $$3) {
            $$1 = $$3;
         }
      }

      o $$4;
      if ($$1 != null) {
         $$4 = $$1.a();
         if ($$1 != $$0) {
            $$4.a("Wrapped in").a("Wrapping exception", $$0);
         }
      } else {
         $$4 = new o("Exception in server tick loop", $$0);
      }

      return $$4;
   }

   private boolean bg() {
      return this.bs() || ac.b() < (this.aj ? this.ai : this.ah);
   }

   protected void p_() {
      this.bq();
      this.c(() -> !this.bg());
   }

   protected afi a(Runnable $$0) {
      return new afi(this.T, $$0);
   }

   protected boolean a(afi $$0) {
      return $$0.a() + 3 < this.T || this.bg();
   }

   @Override
   public boolean x() {
      boolean $$0 = this.bh();
      this.aj = $$0;
      return $$0;
   }

   private boolean bh() {
      if (super.x()) {
         return true;
      } else {
         if (this.bg()) {
            for (aki $$0 : this.F()) {
               if ($$0.k().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(afi $$0) {
      this.aN().d("runTask");
      super.d($$0);
   }

   private Optional<ads.a> bi() {
      Optional<Path> $$0 = Optional.of(this.c("server-icon.png").toPath())
         .filter($$0x -> Files.isRegularFile($$0x))
         .or(() -> this.h.f().filter($$0x -> Files.isRegularFile($$0x)));
      return $$0.flatMap($$0x -> {
         try {
            BufferedImage $$1 = ImageIO.read($$0x.toFile());
            Preconditions.checkState($$1.getWidth() == 64, "Must be 64 pixels wide");
            Preconditions.checkState($$1.getHeight() == 64, "Must be 64 pixels high");
            ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
            ImageIO.write($$1, "PNG", $$2);
            return Optional.of(new ads.a($$2.toByteArray()));
         } catch (Exception var3) {
            n.error("Couldn't load server icon", var3);
            return Optional.empty();
         }
      });
   }

   public Optional<Path> y() {
      return this.h.f();
   }

   public File z() {
      return new File(".");
   }

   public void a(o $$0) {
   }

   public void g() {
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ac.c();
      this.T++;
      this.b($$0);
      if ($$1 - this.af >= 5000000000L) {
         this.af = $$1;
         this.I = this.bj();
      }

      if (this.T % 6000 == 0) {
         n.debug("Autosave started");
         this.A.a("save");
         this.b(true, false, false);
         this.A.c();
         n.debug("Autosave finished");
      }

      this.A.a("tallying");
      long $$2 = this.k[this.T % 100] = ac.c() - $$1;
      this.ar = this.ar * 0.8F + (float)$$2 / 1000000.0F * 0.19999999F;
      long $$3 = ac.c();
      this.ap.a($$3 - $$1);
      this.A.c();
   }

   private ads bj() {
      ads.b $$0 = this.bk();
      return new ads(te.a(this.Y), Optional.of($$0), Optional.of(ads.c.a()), Optional.ofNullable(this.J), this.aw());
   }

   private ads.b bk() {
      List<akj> $$0 = this.Q.t();
      int $$1 = this.I();
      if (this.aj()) {
         return new ads.b($$1, $$0.size(), List.of());
      } else {
         int $$2 = Math.min($$0.size(), 12);
         ObjectArrayList<GameProfile> $$3 = new ObjectArrayList($$2);
         int $$4 = aro.a(this.K, 0, $$0.size() - $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            akj $$6 = $$0.get($$4 + $$5);
            $$3.add($$6.X() ? $$6.fP() : g);
         }

         ac.b($$3, this.K);
         return new ads.b($$1, $$0.size(), $$3);
      }
   }

   public void b(BooleanSupplier $$0) {
      this.A.a("commandFunctions");
      this.aA().c();
      this.A.b("levels");

      for (aki $$1 : this.F()) {
         this.A.a(() -> $$1 + " " + $$1.ac().a());
         if (this.T % 20 == 0) {
            this.A.a("timeSync");
            this.b($$1);
            this.A.c();
         }

         this.A.a("tick");

         try {
            $$1.a($$0);
         } catch (Throwable var6) {
            o $$3 = o.a(var6, "Exception ticking world");
            $$1.a($$3);
            throw new y($$3);
         }

         this.A.c();
         this.A.c();
      }

      this.A.b("connection");
      this.ad().c();
      this.A.b("players");
      this.Q.d();
      if (aa.aS) {
         py.a.b();
      }

      this.A.b("server gui refresh");

      for (int $$4 = 0; $$4 < this.y.size(); $$4++) {
         this.y.get($$4).run();
      }

      this.A.c();
   }

   private void b(aki $$0) {
      this.Q.a(new aac($$0.V(), $$0.W(), $$0.X().b(cpg.k)), $$0.ac());
   }

   public void A() {
      this.A.a("timeSync");

      for (aki $$0 : this.F()) {
         this.b($$0);
      }

      this.A.c();
   }

   public boolean B() {
      return true;
   }

   public void b(Runnable $$0) {
      this.y.add($$0);
   }

   protected void b(String $$0) {
      this.at = $$0;
   }

   public boolean C() {
      return !this.ag.isAlive();
   }

   public File c(String $$0) {
      return new File(this.z(), $$0);
   }

   public final aki D() {
      return this.P.get(cpk.h);
   }

   @Nullable
   public aki a(aeo<cpk> $$0) {
      return this.P.get($$0);
   }

   public Set<aeo<cpk>> E() {
      return this.P.keySet();
   }

   public Iterable<aki> F() {
      return this.P.values();
   }

   @Override
   public String G() {
      return aa.b().c();
   }

   @Override
   public int H() {
      return this.Q.m();
   }

   @Override
   public int I() {
      return this.Q.n();
   }

   public String[] J() {
      return this.Q.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ab b(ab $$0) {
      $$0.a("Server Running", () -> Boolean.toString(this.R));
      if (this.Q != null) {
         $$0.a("Player Count", () -> this.Q.m() + " / " + this.Q.n() + "; " + this.Q.t());
      }

      $$0.a("Data Packs", () -> this.ak.f().stream().map($$0x -> $$0x.f() + ($$0x.c().a() ? "" : " (incompatible)")).collect(Collectors.joining(", ")));
      $$0.a("Enabled Feature Flags", () -> cdv.d.b(this.m.M()).stream().map(aep::toString).collect(Collectors.joining(", ")));
      $$0.a("World Generation", () -> this.m.D().toString());
      if (this.at != null) {
         $$0.a("Server Id", () -> this.at);
      }

      return this.a($$0);
   }

   public abstract ab a(ab var1);

   public arn K() {
      return arn.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(te $$0) {
      n.info($$0.getString());
   }

   public KeyPair L() {
      return this.aa;
   }

   public int M() {
      return this.N;
   }

   public void a(int $$0) {
      this.N = $$0;
   }

   @Nullable
   public GameProfile N() {
      return this.ab;
   }

   public void b(@Nullable GameProfile $$0) {
      this.ab = $$0;
   }

   public boolean O() {
      return this.ab != null;
   }

   protected void P() {
      n.info("Generating keypair");

      try {
         this.aa = aqn.b();
      } catch (aqo var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(bgl $$0, boolean $$1) {
      if ($$1 || !this.m.t()) {
         this.m.a(this.m.n() ? bgl.d : $$0);
         this.bt();
         this.ac().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void bt() {
      for (aki $$0 : this.F()) {
         $$0.b(this.Q(), this.W());
      }
   }

   public void b(boolean $$0) {
      this.m.d($$0);
      this.ac().t().forEach(this::c);
   }

   private void c(akj $$0) {
      ebs $$1 = $$0.dK().u_();
      $$0.c.b(new xb($$1.s(), $$1.t()));
   }

   public boolean Q() {
      return this.m.s() != bgl.a;
   }

   public boolean R() {
      return this.ac;
   }

   public void c(boolean $$0) {
      this.ac = $$0;
   }

   public Optional<MinecraftServer.b> S() {
      return Optional.empty();
   }

   public boolean T() {
      return this.S().filter(MinecraftServer.b::c).isPresent();
   }

   public abstract boolean l();

   public abstract int m();

   public boolean U() {
      return this.U;
   }

   public void d(boolean $$0) {
      this.U = $$0;
   }

   public boolean V() {
      return this.V;
   }

   public void e(boolean $$0) {
      this.V = $$0;
   }

   public boolean W() {
      return true;
   }

   public boolean X() {
      return true;
   }

   public abstract boolean n();

   public boolean Y() {
      return this.W;
   }

   public void f(boolean $$0) {
      this.W = $$0;
   }

   public boolean Z() {
      return this.X;
   }

   public void g(boolean $$0) {
      this.X = $$0;
   }

   public abstract boolean o();

   @Override
   public String aa() {
      return this.Y;
   }

   public void d(String $$0) {
      this.Y = $$0;
   }

   public boolean ab() {
      return this.S;
   }

   public anx ac() {
      return this.Q;
   }

   public void a(anx $$0) {
      this.Q = $$0;
   }

   public abstract boolean p();

   public void a(cph $$0) {
      this.m.a($$0);
   }

   public alf ad() {
      return this.G;
   }

   public boolean ae() {
      return this.ad;
   }

   public boolean af() {
      return false;
   }

   public boolean a(@Nullable cph $$0, boolean $$1, int $$2) {
      return false;
   }

   public int ag() {
      return this.T;
   }

   public int ah() {
      return 16;
   }

   public boolean a(aki $$0, gv $$1, cbl $$2) {
      return false;
   }

   public boolean ai() {
      return true;
   }

   public boolean aj() {
      return false;
   }

   public Proxy ak() {
      return this.j;
   }

   public int al() {
      return this.Z;
   }

   public void c(int $$0) {
      this.Z = $$0;
   }

   public MinecraftSessionService am() {
      return this.l.b();
   }

   @Nullable
   public arx an() {
      return this.l.a();
   }

   public GameProfileRepository ao() {
      return this.l.d();
   }

   @Nullable
   public ant ap() {
      return this.l.e();
   }

   @Nullable
   public ads aq() {
      return this.I;
   }

   public void ar() {
      this.af = 0L;
   }

   public int as() {
      return 29999984;
   }

   @Override
   public boolean at() {
      return super.at() && !this.ab();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.ab()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread au() {
      return this.ag;
   }

   public int av() {
      return 256;
   }

   public boolean aw() {
      return false;
   }

   public long ax() {
      return this.ah;
   }

   public DataFixer ay() {
      return this.L;
   }

   public int a(@Nullable aki $$0) {
      return $$0 != null ? $$0.X().c(cpg.r) : 10;
   }

   public afb az() {
      return this.au.b.e();
   }

   public afd aA() {
      return this.ao;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      ht.b $$1 = this.O.b(aey.d);
      CompletableFuture<Void> $$2 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> $$0.stream().map(this.ak::c).filter(Objects::nonNull).map(ams::e).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$1x -> {
            ana $$2x = new and(alz.b, $$1x);
            return aez.a($$2x, $$1, this.m.M(), this.l() ? dt.a.b : dt.a.c, this.j(), this.as, this).whenComplete(($$1xx, $$2xx) -> {
               if ($$2xx != null) {
                  $$2x.close();
               }
            }).thenApply($$1xx -> new MinecraftServer.a($$2x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.au.close();
            this.au = $$1x;
            this.ak.a($$0);
            cqd $$2x = new cqd(a(this.ak), this.m.M());
            this.m.a($$2x);
            this.au.b.a(this.aV());
            this.ac().h();
            this.ac().u();
            this.ao.a(this.au.b.a());
            this.av.a(this.au.a);
         }, this);
      if (this.bm()) {
         this.c($$2::isDone);
      }

      return $$2;
   }

   public static cqd a(amv $$0, coy $$1, boolean $$2, cdt $$3) {
      $$0.a();
      if ($$2) {
         $$0.a(Collections.singleton("vanilla"));
         return cqd.c;
      } else {
         Set<String> $$4 = Sets.newLinkedHashSet();

         for (String $$5 : $$1.a()) {
            if ($$0.d($$5)) {
               $$4.add($$5);
            } else {
               n.warn("Missing data pack {}", $$5);
            }
         }

         for (ams $$6 : $$0.c()) {
            String $$7 = $$6.f();
            if (!$$1.b().contains($$7)) {
               cdt $$8 = $$6.d();
               boolean $$9 = $$4.contains($$7);
               if (!$$9 && $$6.j().a()) {
                  if ($$8.a($$3)) {
                     n.info("Found new data pack {}, loading it automatically", $$7);
                     $$4.add($$7);
                  } else {
                     n.info("Found new data pack {}, but can't load it due to missing features {}", $$7, cdv.a($$3, $$8));
                  }
               }

               if ($$9 && !$$8.a($$3)) {
                  n.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", $$7, cdv.a($$3, $$8));
                  $$4.remove($$7);
               }
            }
         }

         if ($$4.isEmpty()) {
            n.info("No datapacks selected, forcing vanilla");
            $$4.add("vanilla");
         }

         $$0.a($$4);
         coy $$10 = a($$0);
         cdt $$11 = $$0.e();
         return new cqd($$10, $$11);
      }
   }

   private static coy a(amv $$0) {
      Collection<String> $$1 = $$0.d();
      List<String> $$2 = ImmutableList.copyOf($$1);
      List<String> $$3 = $$0.b().stream().filter($$1x -> !$$1.contains($$1x)).collect(ImmutableList.toImmutableList());
      return new coy($$2, $$3);
   }

   public void a(ds $$0) {
      if (this.aK()) {
         anx $$1 = $$0.l().ac();
         aof $$2 = $$1.i();

         for (akj $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.fP())) {
               $$4.c.b(te.c("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public amv aB() {
      return this.ak;
   }

   public dt aC() {
      return this.au.b.d();
   }

   public ds aD() {
      aki $$0 = this.D();
      return new ds(this, $$0 == null ? ehf.b : ehf.a($$0.R()), ehe.a, $$0, 4, "Server", te.b("Server"), this, null);
   }

   @Override
   public boolean f_() {
      return true;
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public abstract boolean N_();

   public cma aE() {
      return this.au.b.c();
   }

   public afg aF() {
      return this.al;
   }

   public ebo aG() {
      if (this.am == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.am;
      }
   }

   public eck aH() {
      return this.au.b.b();
   }

   public cpg aI() {
      return this.D().X();
   }

   public afo aJ() {
      return this.an;
   }

   public boolean aK() {
      return this.aq;
   }

   public void h(boolean $$0) {
      this.aq = $$0;
   }

   public float aL() {
      return this.ar;
   }

   public int c(GameProfile $$0) {
      if (this.ac().g($$0)) {
         anz $$1 = this.ac().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.O()) {
            return this.ac().v() ? 4 : 0;
         } else {
            return this.i();
         }
      } else {
         return 0;
      }
   }

   public arc aM() {
      return this.ap;
   }

   public bde aN() {
      return this.A;
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for (Entry<aeo<cpk>, aki> $$2 : this.P.entrySet()) {
            aep $$3 = $$2.getKey().a();
            Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
            Files.createDirectories($$4);
            $$2.getValue().a($$4);
         }

         this.d($$0.resolve("gamerules.txt"));
         this.e($$0.resolve("classpath.txt"));
         this.c($$0.resolve("stats.txt"));
         this.f($$0.resolve("threads.txt"));
         this.a($$0.resolve("server.properties.txt"));
         this.g($$0.resolve("modules.txt"));
      } catch (IOException var7) {
         n.warn("Failed to save debug report", var7);
      }
   }

   private void c(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.bn()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aL()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.k)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ac.f()));
      }
   }

   private void d(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         final List<String> $$2 = Lists.newArrayList();
         final cpg $$3 = this.aI();
         cpg.a(new cpg.c() {
            @Override
            public <T extends cpg.g<T>> void a(cpg.e<T> $$0, cpg.f<T> $$1) {
               $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.a($$0)));
            }
         });

         for (String $$4 : $$2) {
            $$1.write($$4);
         }
      }
   }

   private void e(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         String $$2 = System.getProperty("java.class.path");
         String $$3 = System.getProperty("path.separator");

         for (String $$4 : Splitter.on($$3).split($$2)) {
            $$1.write($$4);
            $$1.write("\n");
         }
      }
   }

   private void f(Path $$0) throws IOException {
      ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
      Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));

      try (Writer $$3 = Files.newBufferedWriter($$0)) {
         for (ThreadInfo $$4 : $$2) {
            $$3.write($$4.toString());
            $$3.write(10);
         }
      }
   }

   private void g(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         List<arp.a> $$2;
         try {
            $$2 = Lists.newArrayList(arp.a());
         } catch (Throwable var7) {
            n.warn("Failed to list native modules", var7);
            return;
         }

         $$2.sort(Comparator.comparing($$0x -> $$0x.a));

         for (arp.a $$5 : $$2) {
            $$1.write($$5.toString());
            $$1.write(10);
         }
      }
   }

   private void bu() {
      if (this.D) {
         this.z = beo.a(new bes(ac.a, this.l()), ac.a, ac.g(), new beu("server"), this.B, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.C.accept($$0);
         });
         this.D = false;
      }

      this.A = bdh.a(this.z.f(), bdh.a("Server"));
      this.z.c();
      this.A.a();
   }

   private void bv() {
      this.A.b();
      this.z.d();
   }

   public boolean aO() {
      return this.z.e();
   }

   public void a(Consumer<bdd> $$0, Consumer<Path> $$1) {
      this.B = $$1x -> {
         this.aP();
         $$0.accept($$1x);
      };
      this.C = $$1;
      this.D = true;
   }

   public void aP() {
      this.z = bep.a;
   }

   public void aQ() {
      this.z.a();
   }

   public void aR() {
      this.z.b();
      this.A = this.z.f();
   }

   public Path a(ebt $$0) {
      return this.h.a($$0);
   }

   public boolean aS() {
      return true;
   }

   public dyr aT() {
      return this.av;
   }

   public ecb aU() {
      return this.m;
   }

   public ht.b aV() {
      return this.O.a();
   }

   public hm<aey> aW() {
      return this.O;
   }

   public all a(akj $$0) {
      return all.a;
   }

   public akk b(akj $$0) {
      return (akk)(this.R() ? new ajz($$0) : new akk($$0));
   }

   @Nullable
   public cph aX() {
      return null;
   }

   public ank aY() {
      return this.au.a;
   }

   public boolean aZ() {
      return this.aw;
   }

   public boolean ba() {
      return this.F || this.E != null;
   }

   public void bb() {
      this.F = true;
   }

   public bdd bc() {
      if (this.E == null) {
         return bcz.a;
      } else {
         bdd $$0 = this.E.a(ac.c(), this.T);
         this.E = null;
         return $$0;
      }
   }

   public int bd() {
      return 1000000;
   }

   public void a(te $$0, ta.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         n.info("[{}] {}", $$2, $$3);
      } else {
         n.info("{}", $$3);
      }
   }

   public sz be() {
      return sz.a;
   }

   public boolean bf() {
      return true;
   }

   static record a(ana a, aez b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }

   public static record b(String a, String b, boolean c, @Nullable te d) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      bdd a(final long $$0, final int $$1) {
         return new bdd() {
            @Override
            public List<bdg> a(String $$0x) {
               return Collections.emptyList();
            }

            @Override
            public boolean a(Path $$0x) {
               return false;
            }

            @Override
            public long a() {
               return c.this.a;
            }

            @Override
            public int b() {
               return c.this.b;
            }

            @Override
            public long c() {
               return $$0;
            }

            @Override
            public int d() {
               return $$1;
            }

            @Override
            public String e() {
               return "";
            }
         };
      }
   }
}
