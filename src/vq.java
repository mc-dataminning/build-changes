import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record vq(vr j, vr k) {
   public static final Codec<vq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(vr.a.fieldOf("chat").forGetter(vq::a), vr.a.fieldOf("narration").forGetter(vq::b)).apply($$0, vq::new)
   );
   public static final vr b = vr.a("chat.type.text");
   public static final ajg<vq> c = a("chat");
   public static final ajg<vq> d = a("say_command");
   public static final ajg<vq> e = a("msg_command_incoming");
   public static final ajg<vq> f = a("msg_command_outgoing");
   public static final ajg<vq> g = a("team_msg_command_incoming");
   public static final ajg<vq> h = a("team_msg_command_outgoing");
   public static final ajg<vq> i = a("emote_command");

   private static ajg<vq> a(String $$0) {
      return ajg.a(kj.av, new ajh($$0));
   }

   public static void a(pl<vq> $$0) {
      $$0.a(c, new vq(b, vr.a("chat.type.text.narrate")));
      $$0.a(d, new vq(vr.a("chat.type.announcement"), vr.a("chat.type.text.narrate")));
      $$0.a(e, new vq(vr.b("commands.message.display.incoming"), vr.a("chat.type.text.narrate")));
      $$0.a(f, new vq(vr.c("commands.message.display.outgoing"), vr.a("chat.type.text.narrate")));
      $$0.a(g, new vq(vr.d("chat.type.team.text"), vr.a("chat.type.text.narrate")));
      $$0.a(h, new vq(vr.d("chat.type.team.sent"), vr.a("chat.type.text.narrate")));
      $$0.a(i, new vq(vr.a("chat.type.emote"), vr.a("chat.type.emote")));
   }

   public static vq.a a(ajg<vq> $$0, box $$1) {
      return a($$0, $$1.dM().H_(), $$1.O_());
   }

   public static vq.a a(ajg<vq> $$0, du $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static vq.a a(ajg<vq> $$0, iz $$1, vu $$2) {
      iy<vq> $$3 = $$1.d(kj.av);
      return new vq.a($$3.g($$0), $$2);
   }

   public vr a() {
      return this.j;
   }

   public vr b() {
      return this.k;
   }

   public static record a(il<vq> b, vu c, Optional<vu> d) {
      public static final xs<vf, vq.a> a = xs.a(xq.b(kj.av), vq.a::a, vw.b, vq.a::b, vw.c, vq.a::c, vq.a::new);

      a(il<vq> $$0, vu $$1) {
         this($$0, $$1, Optional.empty());
      }

      public vu a(vu $$0) {
         return this.b.a().a().a($$0, this);
      }

      public vu b(vu $$0) {
         return this.b.a().b().a($$0, this);
      }

      public vq.a c(vu $$0) {
         return new vq.a(this.b, this.c, Optional.of($$0));
      }

      public il<vq> a() {
         return this.b;
      }

      public vu b() {
         return this.c;
      }

      public Optional<vu> c() {
         return this.d;
      }
   }
}
