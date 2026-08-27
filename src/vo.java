import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record vo(vp j, vp k) {
   public static final Codec<vo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(vp.a.fieldOf("chat").forGetter(vo::a), vp.a.fieldOf("narration").forGetter(vo::b)).apply($$0, vo::new)
   );
   public static final vp b = vp.a("chat.type.text");
   public static final ajb<vo> c = a("chat");
   public static final ajb<vo> d = a("say_command");
   public static final ajb<vo> e = a("msg_command_incoming");
   public static final ajb<vo> f = a("msg_command_outgoing");
   public static final ajb<vo> g = a("team_msg_command_incoming");
   public static final ajb<vo> h = a("team_msg_command_outgoing");
   public static final ajb<vo> i = a("emote_command");

   private static ajb<vo> a(String $$0) {
      return ajb.a(ki.av, new ajc($$0));
   }

   public static void a(pj<vo> $$0) {
      $$0.a(c, new vo(b, vp.a("chat.type.text.narrate")));
      $$0.a(d, new vo(vp.a("chat.type.announcement"), vp.a("chat.type.text.narrate")));
      $$0.a(e, new vo(vp.b("commands.message.display.incoming"), vp.a("chat.type.text.narrate")));
      $$0.a(f, new vo(vp.c("commands.message.display.outgoing"), vp.a("chat.type.text.narrate")));
      $$0.a(g, new vo(vp.d("chat.type.team.text"), vp.a("chat.type.text.narrate")));
      $$0.a(h, new vo(vp.d("chat.type.team.sent"), vp.a("chat.type.text.narrate")));
      $$0.a(i, new vo(vp.a("chat.type.emote"), vp.a("chat.type.emote")));
   }

   public static vo.a a(ajb<vo> $$0, bof $$1) {
      return a($$0, $$1.dJ().I_(), $$1.Q_());
   }

   public static vo.a a(ajb<vo> $$0, du $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static vo.a a(ajb<vo> $$0, iy $$1, vs $$2) {
      ix<vo> $$3 = $$1.d(ki.av);
      return new vo.a($$3.f($$0), $$2);
   }

   public vp a() {
      return this.j;
   }

   public vp b() {
      return this.k;
   }

   public static record a(il<vo> b, vs c, Optional<vs> d) {
      public static final xq<vd, vo.a> a = xq.a(xo.b(ki.av), vo.a::a, vu.b, vo.a::b, vu.c, vo.a::c, vo.a::new);

      a(il<vo> $$0, vs $$1) {
         this($$0, $$1, Optional.empty());
      }

      public vs a(vs $$0) {
         return this.b.a().a().a($$0, this);
      }

      public vs b(vs $$0) {
         return this.b.a().b().a($$0, this);
      }

      public vo.a c(vs $$0) {
         return new vo.a(this.b, this.c, Optional.of($$0));
      }

      public il<vo> a() {
         return this.b;
      }

      public vs b() {
         return this.c;
      }

      public Optional<vs> c() {
         return this.d;
      }
   }
}
